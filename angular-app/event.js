var app = angular.module("studentApp", []);
app.controller("studentCotroller",['$scope','$timeout','$rootScope', function ($scope, $timeout,$rootScope) {
    $scope.display = function () {
        $scope.student = {
            Id: 26,
            Name: "yogita",
            image: "user.png",
            cgpi: 7.08

        }
    
    $timeout(function(){
        $scope.student = {
                Id: 20,
                Name: "Shekhar",
                image: "",
                cgpi: 8.88
            }
    },5000)
    }    
            
    
}])