/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author Rodrigo
 */
public class Persona {
    
    public String usuario;
    public String clave;

    public Persona(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public Persona() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
}
