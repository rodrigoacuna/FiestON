/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
angular.module('fiestonApp',[]).controller('userController',['$scope','service', function($scope, servicio){
    
    $scope.userList = [];
    
    function getUserList($scope, $http) {
    $http.get('localhost:8080/fieston/api/services/getLisUser').
        success(function(data) {
            this.userList = data;
        });
    }
    
        /*$scope.userList = [
            {usu:"rodri_usuario",clave:"rodri",mail:"mail@mail.com", isChecked:false},
            {usu:"cateaaaa",clave:"cata",mail:"cata@mail.com", isChecked:true},
            {usu:"nicooooo",clave:"nico",mail:"nico@mail.com", isChecked:false}
        ];*/
    
    /*self.getUserArray = function(){
        return self.model.usuarios;
    }*/
            
}]);

