angular.module("emp-spa")
    .factory('EmployeeService', function () {
        console.log("inside employee service")
        var obj = {}
        var employees = [{
            id: 101,
            name: "Shekhar",
            dateOfJoining: "26/6/2019",
            salary: 30000,
            designation: "Developer"
        },
        {
            id: 102,
            name: "Yogita",
            dateOfJoining: "26/6/2019",
            salary: 30000,
            designation: "Developer"
        },
        {
            id: 103,
            name: "Deepak",
            dateOfJoining: "26/6/2019",
            salary: 3000,
            designation: "Tester"
        },
        {
            id: 104,
            name: "Abhishek",
            dateOfJoining: "26/6/2019",
            salary: 30000,
            designation: "Analyst"
        }
        ]
        obj.getEmployee = function () {
            return employees
        }
        obj.getEmployeeByID=function(id){
            return employees(id)
        }
        obj.addEmployee = function (employee) {
            employees.push(employee)
        }
        obj.removeElement=function(employee){
            employees.splice(employee,1)
        }
        obj.updateDetails=function(id){
            console.log(id)
        }
        return obj;
    })