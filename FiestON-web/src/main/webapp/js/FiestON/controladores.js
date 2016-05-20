angular.module('controladores',[]).controller('listaUsuario',['$scope','rtmFactory',
            function ($scope,rtmFactory){
                $scope.paises = rtmFactory.getPaises();
            }
]);

