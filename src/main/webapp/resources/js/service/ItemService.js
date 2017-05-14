'use strict';

App.factory('ItemService', ['$http', '$q', function($http, $q){
	return {
		 
			fetchAllItems: function(category) {
					return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching Items');
										return $q.reject(errResponse);
									}
							); 
			},
			
			fetchAllHotels: function(category) { 
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category,{headers :{"content-type" : "application/json"}})
				  .success(function(data){alert('succ'+data);itemListCtrl.items =data; return data.hotels;}) 
				  .success(function(data){}) 
				  ;
		   },
		    
			fetchSpecificHotels: function(category,city) {		
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/hotels/London')
				 .success(function(data){itemListCtrl.items =data; return data;})
				  .error(function(data){itemListCtrl.items =data; return data;})

				  ;
			
			
			
		   },

			fetchSpecificHotel: function(category,id) {  
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id,{headers :{"content-type" : "application/json"}})
				  .success(function(data){itemListCtrl.items =data;})
				  .error(function(data){itemListCtrl.items =data;})
				  
				  ;
		   },
		   
		   fetchBooking: function(category,id) {
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id,{headers :{"content-type" : "application/json"}})
				  .success(function(data){itemListCtrl.items =data; return data;})
				  .error(function(data){/*alert('error:'+data);*/itemListCtrl.items =data; return data;})
				  
				  ;
		   },
		   fetchTemplate: function(category,id) {
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category)
				  .success(function(data){itemListCtrl.items =data; return data;})
				  .error(function(data){alert(id+'error:'+data);testController.items =data; return data;})
				  
				  ;
		   },

		   fetchSpecificItem: function(category,id) {  
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id)
						.then(
								function(response){
									return response.data;
								}, 
								function(errResponse){
									console.error('Error while fetching specific Item');
									return $q.reject(errResponse);
								}
						);
			},
		   
		   liveDataImgaes:{
			   images:null
			   
		   },
			
			   dataImgaes:{
				   images:[{"caption":"In-Room kitchenette","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_56_z.jpg"},
				           {"caption":"Bathroom","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_57_z.jpg"},
				           {"caption":"Bathroom","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_59_z.jpg"},
				           {"caption":"Guestroom","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_139_z.jpg"},
						   {"caption":"In-Room Amenity","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_129_z.jpg"},
						   {"caption":"Guestroom","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_132_z.jpg"},
						   {"caption":"Living area","url":"http://media.expedia.com/hotels/1000000/210000/201100/201089/201089_125_z.jpg"}
				           ]
				   
			   }
		   
	};

}]);
