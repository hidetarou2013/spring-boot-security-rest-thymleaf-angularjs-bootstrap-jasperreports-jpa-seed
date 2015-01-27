angular.module('com.igumnov.seedproject', [ 'ui.bootstrap', 'ngResource' ])

.factory('City', [ '$resource', function($resource) {
    return $resource('/rest/city/:resourceId', {
	resourceId : '@id'
    }, {
	query : {
	    method : 'GET',
	    cache : false,
	    isArray : false
	},
	add : {
	    method : 'POST',
	    cache : false,
	    isArray : false
	},
	update : {
	    method : 'PUT',
	    cache : false,
	    isArray : false
	},
	delete : {
	    method : 'DELETE',
	    cache : false,
	    isArray : false
	}	
    });
} ])

.controller('CityCtrl', function($scope, City) {
  City.query({}, function(data) {
        $scope.cities = data._embedded.all;
    	
    });
    //$scope.cities = cities._embedded.all;
 //   console.log(cities._embedded.all);
 });
