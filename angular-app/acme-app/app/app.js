angular.module('acme-app',['ngRoute'])
.config(function ($routeProvider) {
    $routeProvider
        // .when('/',{
        //     templateUrl:'app/home.html',
        //     controller:'homeController'
        // })
        .when('/productlist',{
            templateUrl:'app/productList.html',
            controller:'productsController'
        })
        .when('/productDetails',{
            templateUrl:'app/productDetails.html',
            controller:'detailsController'
        })
        .when('/',{
            templateUrl:'app/welcome.html',
            controller:'welcomeController'
        })
    })