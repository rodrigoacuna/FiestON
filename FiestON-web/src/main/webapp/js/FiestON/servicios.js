angular.module('servicios',[]).value('version','01')

        .factory('rtmFactory', function (){
            var paises = [
            {name:'USA', code:'us'},
            {name:'USURUGAY', code:'uy'}
            ];
            return{
                getPaises: function(){
                    return paises;
                }
            }
        })


