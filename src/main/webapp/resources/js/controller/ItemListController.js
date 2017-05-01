'use strict';

App.controller('ItemListController', ['async', function(async) {
          var self = this;
          self.items=async;
}]);

App.controller('UtilityController', function ($scope){
   
	this.doFormatDate=function(searchTerm){$scope.message=$('#CityAjaxH').val();}
	this.toggleShowHide=function(sh){$scope.checked= !sh;}
     
})
.filter('trusted', ['$sce', function($sce){
    return function(text) {
        return $sce.trustAsHtml(text);
    };
}])
;


