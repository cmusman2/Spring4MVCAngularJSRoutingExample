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
		    
			fetchSpecificHotels: function(category,city) {alert(2);			
				/*return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/London',{headers :{"content-type" : "application/json"}})
				  .success(function(data){alert('succ');itemListCtrl.items =data; return data;})
				  .error(function(data){alert('error');itemListCtrl.items =data; return data;})

				  ;*/
			alert(3);
			
		   },

			fetchSpecificHotel: function(category,id) {  
				return $http.get('../Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id,{headers :{"content-type" : "application/json"}})
				  .success(function(data){alert('succ'+data);itemListCtrl.items =data; return data;})
				  .error(function(data){ alert('error:'+data); itemListCtrl.items =data; return data;})
				  
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
			}
	};

}]);
