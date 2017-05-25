'use strict';
App.controller('ItemListController', ['async', function(async,    ItemService) {
          var self = this;
          self.items=async;
         
          
          
}]);



App.controller('SubmissionController', function($scope, $localStorage, $sessionStorage,   $window, $location,    ItemService) {
	 
	  var dt = new Date();
	  dt = dt.setDate(dt.getDate() + 2);
	  $scope.from= dt;
	  $scope.hotelid='';
	  
	  $scope.submitForm = function (isValid){	
		  $scope.searchForm.$setSubmitted();
		  if($scope.searchForm.$invalid){
		       alert('inalid'); return;
		    }
		  
		   
		  var path= '/items/hotels/'+ $('#CityAjaxH').val() +'/'+  $('#from').val() + '/' + $scope.nights;		  
		  //var path= '/items/hotels/London/20-10-2017/1';
		  sessionStorage.city = $('#CityAjaxH').val();
		  sessionStorage.checkindate = $('#from').val();
		  sessionStorage.nights = $('#nights').val();
		  
		  
		 
		  $location.path(path);	    
	  }
	  
	  $scope.submitForDetails=function ()
	  {
		   
		  $sessionStorage.hotelid = hotelid;
		  
		  var path='/items/hotels/details/'+$sessionStorage.hotelid;
		  $location.path(path);	
	  }
	  
	  $scope.doSubmitForDetails=function ($index)
	  {
		  
	  
		  sessionStorage.hotelid = JSON.parse(sessionStorage.htlData)[$index].hotelid;
	
		  
		  var path='/items/hotels/details/'+sessionStorage.hotelid;
		  $location.path(path);	
	  }
	  
	  $scope.doSubmitForBooking=function ($index)
	  {
		  
	  
		  sessionStorage.ratecode = JSON.parse(sessionStorage.roomData)[$index].ratecode;
		  sessionStorage.roomtypecode = JSON.parse(sessionStorage.roomData)[$index].roomtypecode;
	
		  
		  var path='/items/booking/'+sessionStorage.hotelid;
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
    
    var countUp = function() {
        $scope.timeInMs+= 500;
        $timeout(countUp, 500);
    }
    
    $timeout(countUp, 500);
});
	
	App.controller('CarouselCtrl', function ($scope,ItemService) {
		  $scope.myInterval = 3000;
		  $scope.noWrapSlides = false;
		  $scope.active = 0;
		  var slides = $scope.slides = [];
		  var currIndex = 0;

		  $scope.addSlide = function(img) {
		    var newWidth = 600 + slides.length + 1;
		    slides.push({
		      image: img.url,
		      text: img.caption,
		      id: currIndex++
		    });
		  };

		  $scope.message="hasimg";

		  for (var i = 0; i < ItemService.liveDataImgaes.images.length; i++) {
		    $scope.addSlide( ItemService.liveDataImgaes.images[i]);
		  }
		  
		
		  $scope.dataSlides=function(ds)
		  {
			  $scope.slides = ds;
		  }

		  $scope.hasImgaes=function(setIndex)
		  {$scope.message="hasimg3";
			  for(var i=0;i< $scope.slides.length; i++)
				  if ($scope.slides[i].id == setIndex){
					  break;
					  }
			   
			  
			  if (ItemService.liveDataImgaes.images == null) {alert('no')} else {alert('yes' + ItemService.liveDataImgaes.images.length);}
		  }
		  
		  $scope.findId=function(slide)
		  {			 
			  return slide.id;
		  }
		 
		  
		  $scope.setImages=function(img)
		  {			 
			  $scope.cimg = img;
			 
		  }
		  
		});	
	
	
	
	

