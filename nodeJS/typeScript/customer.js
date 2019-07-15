var Customer = /** @class */ (function () {
    function Customer(id, firstname, lastname) {
        this._id = id;
        this._firstname = firstname;
        this._lastname = lastname;
    }
    Object.defineProperty(Customer.prototype, "FirstName", {
        get: function () {
            return this._firstname;
        },
        set: function (fname) {
            this._firstname = fname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "LastName", {
        get: function () {
            return this._lastname;
        },
        set: function (lname) {
            this._lastname = lname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "Id", {
        get: function () {
            return this._id;
        },
        set: function (id) {
            this._id = id;
        },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
var c1 = new Customer(101, "Yogita", "More");
console.log(c1.FirstName);
c1.FirstName = "Pranjal";
console.log(c1.FirstName);
