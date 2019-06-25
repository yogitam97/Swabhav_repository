angular.module('acme-app')
.factory('ProductService',['$http', function ($http) {
    console.log("inside product service")
    var obj={}
    var products
    $http.get('app/data.json').then(function(response) {
        products = response.data;  
     });
    obj.getProducts=function(){
         return products
    }
    obj.getById=function(id){
        return products[id]
    }
    return obj;
}])