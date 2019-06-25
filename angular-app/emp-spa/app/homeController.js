angular.module("emp-spa")
    .controller('homeController',['$scope','EmployeeService', function ($scope,EmployeeService) {
        console.log("inside home controller")
        
        $scope.getEmps = EmployeeService.getEmployee();
        console.log($scope.getEmps)
        $scope.delete=function(id){
            EmployeeService.removeElement(id);
        }
    }])