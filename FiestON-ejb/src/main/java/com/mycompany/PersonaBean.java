/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import static java.lang.System.out;
import javax.ejb.Init;
import javax.ejb.Stateless;

/**
 *
 * @author Rodrigo
 */
@Stateless
public class PersonaBean implements PersonaBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public Persona p ;
    
    public PersonaBean(){
         Persona p = new Persona();
    }
    
    public void crearPersona(String usu, String pass){
       
        p.usuario=usu;
        p.clave=pass;
    }
    @Override
    public void ImprimirPersona(){
        System.out.println("LAAAA PUTA MADREEEEEEE");
    }
    
}
