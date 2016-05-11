/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.Local;

/**
 *
 * @author Rodrigo
 */
@Local
public interface PersonaBeanLocal {
    
    public void crearPersona(String usu, String pas);
    public void ImprimirPersona();
    
}
