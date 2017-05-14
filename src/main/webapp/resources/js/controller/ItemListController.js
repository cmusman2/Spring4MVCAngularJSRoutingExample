'use strict';
App.controller('ItemListController', ['async', function(async) {
          var self = this;alert('cont');
          self.items=async;
           
}]);



App.controller('SubmissionController', function($scope, $window, $location) {
	  $scope.name = 'World';
	  var dt = new Date();
	  dt = dt.setDate(dt.getDate() + 2);
	  $scope.from= dt;
	  
	  
	  $scope.submitForm = function (isValid){	
		  var path= '/items/hotels/'+ $('#CityAjaxH').val()+'/'+ $('#from').val() + '/' + $('#nights').val();		  
		  //var path= '/items/hotels/London/20-10-2017/1';		  
		  $location.path(path);	    
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



	App.controller('sliderCtrl', function ($scope, $timeout){	
    $scope.timeInMs = 0;
   alert($scope.items);
    var countUp = function() {
        $scope.timeInMs+= 500;
        $timeout(countUp, 500);
    }
    
    $timeout(countUp, 500);
});
	
	App.controller('CarouselDemoCtrl', function ($scope) {
		  $scope.myInterval = 3000;
		  $scope.noWrapSlides = false;
		  $scope.active = 0;
		  var slides = $scope.slides = [];
		  var currIndex = 0;

		  $scope.addSlide = function() {
		    var newWidth = 600 + slides.length + 1;
		    slides.push({
		      image: 'http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_56_t.jpg',
		      text: ['Nice image','Awesome photograph','That is so cool','I love that'][slides.length % 4],
		      id: currIndex++
		    });
		  };

		 

		  for (var i = 0; i < 4; i++) {
		    $scope.addSlide();
		  }

		  // Randomize logic below

		  
		});	
