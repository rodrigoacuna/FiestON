/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
angular.module('fiestion')
        .controller('userController', ['$scope', function($scope){
    
        $scope.usuarios = [
            {usu:"rodri_usuario",clave:"rodri",mail:"mail@mail.com"},
            {usu:"cateaaaa",clave:"cata",mail:"cata@mail.com"},
            {usu:"nicooooo",clave:"nico",mail:"nico@mail.com"}
        ];
    
    /*self.getUserArray = function(){
        return self.model.usuarios;
    }*/
            
}]);

