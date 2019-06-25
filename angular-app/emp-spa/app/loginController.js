angular.module("emp-spa")
    .controller('loginController', ['$scope', '$location', '$rootScope', '$window', 'EmployeeService', function ($scope, $location, $rootScope, $window, EmployeeService) {
        $scope.login = function () {

            if ($scope.username == $scope.password) {
                $rootScope.show = true
                $rootScope.flag = true
                $rootScope.status=true
                $rootScope.username = $scope.username
                alert("You logged in successfully")
                $location.path("/")
        
                $window.sessionStorage.setItem('username', $scope.username)
                $window.sessionStorage.setItem('password', $scope.password)
            }
            if ($scope.username != $scope.password) {
                alert("Username or password in incorrect")
            }
        }

        $rootScope.logout = function () {
            alert($rootScope.username + " logged out")
            $window.sessionStorage.setItem('username', "")
            $window.sessionStorage.setItem('password', "")
            $rootScope.show = false;
            $rootScope.flag = false;
            $location.path("/");
        }

        function loginDetails() {
            if ($window.sessionStorage.getItem("username") == "admin" && $window.sessionStorage.getItem("password") == "admin") {
                $scope.username = $window.sessionStorage.getItem("username")
                $scope.password = $window.sessionStorage.getItem("password")
                $scope.login()
                console.log($window.sessionStorage.getItem("username"))
                console.log($window.sessionStorage.getItem("password"))
            }
        }
        loginDetails()
    }])