angular.module('acme-app')
    .controller('detailsController', ['$scope', '$routeParams','$location', '$rootScope', 'ProductService',function ($scope, $routeParams,$location, $rootScope,ProductService) {
        console.log("inside product details conroller")
        $rootScope.displayDetails = function (index) {
            $rootScope.productDetails=ProductService.getById(index)
            console.log($rootScope.productDetails)
        }
       $rootScope.returnBack=function(){
            $location.path('/productlist')
       }
    }])
    .directive('star',[function(){
        var directive={
            template:'<i class="fa fa-star" aria-hidden="true"></i>',
            restrict:'E'
        }
    }])
        .filter('starFilter',function($sce){
            return function(input){
                let stars=""
                let index;
                for(index=1;index<input;index++){
                    stars=stars+'<i class="fa fa-star" aria-hidden="true"></i>'
                }
                index--
                console.log(index);
                let temp=input-index
                console.log(temp)
                if(temp>0){
                    index++
                    stars=stars+'<i class="fa fa-star-half" aria-hidden="true"></i>'
                }
                return $sce.trustAsHtml(stars)
            }
      
    })