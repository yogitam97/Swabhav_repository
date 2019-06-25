angular.module('acme-app')
.controller('starController',['$sce',function($sce){
    console.log("inside star controller")
}])
.directive('star',[function($sce){
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