'use strict';

App.controller('ItemDetailsController', function(async,  $scope,ItemService) {
          var self = this;
          self.item=async;         
          
		  $scope.myInterval = 3000;
		  $scope.noWrapSlides = false;
		  $scope.active = 0;
		  var slides = $scope.slides = [];
		  var currIndex = 0;
		 
		  ItemService.liveDataImgaes.images = async.data.hotelImages.Images;
		  /*
		  $scope.addSlide = function(url,caption) {
			    
			    slides.push({
			      image: url,
			      text: caption,
			      id: currIndex++
			    });
			  };

			
			  
			  for (var i = 0; i < async.data.hotelImages.Images.length; i++) 
			  {				  
			    $scope.addSlide(async.data.hotelImages.Images[i].url,async.data.hotelImages.Images[i].caption);
			  }*/
          
});
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

