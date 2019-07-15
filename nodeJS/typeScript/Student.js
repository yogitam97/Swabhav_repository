"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(rollNo, fname, lname) {
        this.rollNo = rollNo;
        this.fname = fname;
        this.lname = lname;
        this.rollNo = rollNo;
        this.fname = fname;
        this.lname = lname;
    }
    Object.defineProperty(Student.prototype, "RollNo", {
        get: function () {
            return this.rollNo;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "FirstName", {
        get: function () {
            return this.fname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "LastName", {
        get: function () {
            return this.lname;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var Address = /** @class */ (function () {
    function Address(street, city) {
        this.street = street;
        this.city = city;
        this.street = street;
        this.city = city;
    }
    return Address;
}());
exports.Address = Address;
