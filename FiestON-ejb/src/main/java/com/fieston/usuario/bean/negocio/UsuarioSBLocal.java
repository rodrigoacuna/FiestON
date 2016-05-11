/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.usuario.bean.negocio;

import javax.ejb.Local;

/**
 *
 * @author Rodrigo
 */
@Local
public interface UsuarioSBLocal {
    public void agregarUsuario(String usu, String clave, String email);
    public boolean usuarioCorrecto(String usu, String clave);
}
