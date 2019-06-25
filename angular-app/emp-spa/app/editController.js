angular.module("emp-spa")
    .controller('editController', ['$scope', '$routeParams', '$location', '$rootScope', 'EmployeeService', function ($scope, $routeParams, $location, $rootScope, EmployeeService) {

        function onload() {
            if (!$rootScope.status) {
                $location.path('/')
            }
            else {


                $scope.getEmps = EmployeeService.getEmployee();

                $scope.index = $routeParams.id;
                $scope.emp = $scope.getEmps[$scope.index]
                console.log($scope.emp)
                $scope.name = $scope.emp.name
                $scope.designation = $scope.emp.designation
                $scope.id = $scope.emp.id
                $scope.salary = $scope.emp.salary
                $scope.dateOfJoining = $scope.emp.dateOfJoining


                $scope.update = function () {
                    $scope.obj = {
                        id: $scope.id,
                        name: $scope.name,
                        salary: $scope.salary,
                        designation: $scope.designation,
                        dateOfJoining: $scope.dateOfJoining
                    }

                    EmployeeService.getEmployee[$scope.index] = $scope.obj
                    EmployeeService.updateDetails(this.id)
                    $location.path('/')
                }
            }
        }
        onload()
    }])