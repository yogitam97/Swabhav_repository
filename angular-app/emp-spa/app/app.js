angular.module("emp-spa", ['ngRoute'])

    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: "app/home.html",
                controller: "homeController"
            })
            .when('/add', {
                templateUrl: "app/add.html",
                controller: "addController"
            })
            .when('/edit/:id', {
                templateUrl: "app/edit.html",
                controller: "editController"
            })
            .when('/login',{
                templateUrl:"app/login.html",
                controller:"loginController"
            })
    })