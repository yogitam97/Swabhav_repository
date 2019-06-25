angular.module("emp-spa")
    .controller('addController', ['$scope','$location','$rootScope', 'EmployeeService', function ($scope,$location,$rootScope, EmployeeService) {
        console.log("inside add controller")
       
        function onload(){
            if($rootScope.status){
                $location.path('/add')
            }
            else{
                $location.path('/')
            }
        }
        onload()
        $scope.getEmps = EmployeeService.getEmployee();
        $scope.add = function () {
            $scope.obj = {
                id: $scope.id,
                name: $scope.name,
                salary: $scope.salary,
                designation: $scope.designation,
                dateOfJoining: $scope.dateOfJoining
            }
            EmployeeService.addEmployee($scope.obj)
        }
    }])