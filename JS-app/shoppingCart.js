var tableArray = []
var quantityArray = []
var createTable
var sum = 0
var products = [{
    product_id: 1,
    product_name: "Iphone5",
    price: 10000
},
{
    product_id: 2,
    product_name: "Iphone6",
    price: 25000
},
{
    product_id: 3,
    product_name: "Iphone7",
    price: 70000
}, {
    product_id: 4,
    product_name: "Iphone8",
    price: 75000
}]


var options = document.querySelector("#products")
var str = ""
for (var i = 0; i < products.length; i++) {
    str = str + '<option value="' + products[i].product_id + '">' + products[i].product_name + " " + products[i].price + '</option>';
}
options.innerHTML = '<label>Products : </label><select id="select_id"><option value="first">-----Select------</option>' + str + "</select>"

//Add to cart function
var cart = document.querySelector('#addToCart')
createTable = '<table id="products"><thead><th>Product-id</th><th>Product-name</th><th>Quantity</th><th>Unit Price</th><th>Total</th><th>Action</th></thead>';
var str = ""
cart.addEventListener("click", function addTocart() {
    str = ""
    var selectProduct = document.getElementById("select_id").value
    var quantity = document.querySelector('#quantity').value
    for (var i = 0; i < tableArray.length; i++) {
        if (selectProduct == tableArray[i]) {
            quantity = tableArray[i].quantity + quantity
            console.log(quantity)
        }
    }

    for (var i = 0; i < products.length; i++) {

        if (products[i].product_id == selectProduct) {
            getquantity()
            var addRow = "<tr><td>" + products[i].product_id + "</td><td>" + products[i].product_name + "</td><td>" + quantity + "</td><td>" + products[i].price + "</td><td>" + parseInt(quantity) * products[i].price + '</td><td><button type="submit" class="btn" id="removeBtn_id"' + i + '>Remove</button></td></tr>'

            str = str + addRow
            console.log(str)
            tableArray.push(str)
            console.log(quantity)
            quantityArray.push(products[i].price * parseInt(quantity))
            console.log(quantityArray);
        }
        displayTable()
    }


    //check if same product is again adding to the cart
    function getquantity() {
        for (var i = 0; i < tableArray.length; i++) {
            if (selectProduct == tableArray[i].product_id) {
                console.log("same product is adding again")
                quantity = parseInt(tableArray[i].quantity) + quantity
                console.log(quantity)
                //quantity=tableArray[i].quantity
                //return quantity;
            }
            else {
                quantity = parseInt(quantity)
            }
            return quantity

        }
    }
    //displayTable()

})


function displayTable() {
    var tableValue = "";

    for (var i = 0; i < tableArray.length; i++) {
        tableValue = tableValue + tableArray[i];
    }
    document.getElementById("lineitems").innerHTML = createTable + tableValue + "</table>";
    for (var i = 0; i < tableArray.length; i++) {
        sum = sum + quantityArray[i];
        console.log(sum)
    }
    console.log(sum)
    document.getElementById("amount_id").innerHTML = '<label style="background-color:"red">Bill Summmery : ' + sum + "</label>";

    deletebtn = document.querySelectorAll(".btn");
    deletebtn.forEach(element => {

        element.addEventListener("click", function () {
            sum = 0;
            var indexOfRow = this.parentNode.parentNode.rowIndex;
            console.log(indexOfRow);

            tableArray.splice(indexOfRow - 1, 1);
            quantityArray.splice(indexOfRow - 1, 1);
            console.log(tableArray);
            for (var i = 0; i < tableArray.length; i++) {
                console.log(quantityArray);

                sum = sum + quantityArray[i];
                console.log(sum)

            }
            displayTable()
            document.getElementById("amount_id").innerHTML = '<label style="background-color:"red">Total is :' + sum + "</label>";
            sum = 0;
        })


    })


}

//Calculate total cost of product
function totalCost() {
    var cost = price * quantity
    return cost;
}