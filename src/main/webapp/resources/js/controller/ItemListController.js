'use strict';

App.controller('ItemListController', ['async', function(async) {
          var self = this;
          self.items=async;
}]);

App.controller('UtilityController', function ($scope){
   
	this.doFormatDate=function(searchTerm){$scope.message=$('#CityAjaxH').val();}
	this.deocdeHtml=function(searchTerm){$scope.deocdedHtml=" 	<strong>1 King Bed</strong><br />538-sq-foot (50-sq-meter) room w";}
     
})
.filter('trusted', ['$sce', function($sce){
    return function(text) {
        return $sce.trustAsHtml(text);
    };
}])
;


