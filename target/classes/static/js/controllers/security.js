(function() {
    'use strict';

    angular
        .module('cartography')
        .controller('security', SecurityController);


    function SecurityController($scope) {
        $scope.greeting = {id: 'xxx', content: 'Hello World!'}
    }
})();