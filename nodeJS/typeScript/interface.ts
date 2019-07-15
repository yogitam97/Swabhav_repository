interface ICustomer{
    id:String;
    fname:String;
    lname:String;
}
function printCustomer(customers:ICustomer[]){

    for(let c of customers){
        console.log(c.id+" "+c.fname+" "+c.lname);
    }
}
printCustomer([{id:"101",fname:"Yogita",lname:"More"},
{id:"102",fname:"Shekhar",lname:"Patil"}])