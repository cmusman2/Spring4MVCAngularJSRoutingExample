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
				  .success(function(data){itemListCtrl.items =data; return data.hotels;})  ;
		   },
		    
			fetchSpecificHotels: function(category,city) {
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+city,{headers :{"content-type" : "application/json"}})
				  .success(function(data){itemListCtrl.items =data; return data;})
				  .error(function(data){itemListCtrl.items =data; return data;})
				  
				  ;
		   },

			fetchSpecificHotel: function(category,id) {
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id,{headers :{"content-type" : "application/json"}})
				  .success(function(data){itemListCtrl.items =data; return data;})
				  .error(function(data){alert('error:'+data);itemListCtrl.items =data; return data;})
				  
				  ;
		   },
		   
		   fetchBooking: function(category,id) {
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id,{headers :{"content-type" : "application/json"}})
				  .success(function(data){itemListCtrl.items =data; return data;})
				  .error(function(data){alert('error:'+data);itemListCtrl.items =data; return data;})
				  
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
			}
	};

}]);
