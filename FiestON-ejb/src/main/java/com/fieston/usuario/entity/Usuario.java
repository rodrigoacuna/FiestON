/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.usuario.entity;

/**
 *
 * @author Rodrigo
 */
public class Usuario {

    private String usuario;
    private String contrasena;
    private String mail;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, String mail) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.mail = mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object otro) {
        Usuario otroUser = (Usuario) otro;
        return (usuario.equals(otroUser.getUsuario()) 
                && contrasena.equals(otroUser.getContrasena()));

    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

}
