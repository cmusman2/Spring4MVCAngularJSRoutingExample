'use strict';

App.controller('ItemListController', ['async', function(async) {
          var self = this;
          self.items=async;
}]);



App.controller('SubmissionController', function($scope, $window, $location) {
	  $scope.name = 'World';
	  var dt = new Date();
	  dt = dt.setDate(dt.getDate() + 2);
	  $scope.from= dt;
	  
	  
	  $scope.submitForm = function (isValid){		  
		  $location.path('/items/hotels/London');	    
	  }
	  
	  
	  $scope.showPopover = function(v,c) {
		  $scope.popoverIsVisible = true;
		  $scope.popContent=v;
		  $scope.caption=c;
		};

		$scope.hidePopover = function () {
		  $scope.popoverIsVisible = false;
		};
	});

App.controller('UtilityController', function ($scope){
   
	this.doSearchTerm=function(v){$scope.searchTerm=$('#CityAjaxH').val();}
	this.toggleShowHide=function(sh){$scope.checked= !sh;}
     
})
.filter('trusted', ['$sce', function($sce){
    return function(text) {
        return $sce.trustAsHtml(text);
    };
}])
;


