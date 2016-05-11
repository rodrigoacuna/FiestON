/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.usuario.bean.negocio;

import basededatos.UsuariosBD;
import com.fieston.usuario.bean.persistencia.UsuarioPersistenciaSB;
import com.fieston.usuario.bean.persistencia.UsuarioPersistenciaSBLocal;
import com.fieston.usuario.entity.Usuario;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Rodrigo
 */
@Stateless
public class UsuarioSB implements UsuarioSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    UsuarioPersistenciaSBLocal uSBLocal;
    
    
    @Override
    public void agregarUsuario(String usu, String clave, String email){
      Usuario usuario = new Usuario();
        usuario.setUsuario(usu);
        usuario.setContrasena(clave);
        usuario.setMail(email);
        uSBLocal.agregarUsuario(usuario);
        
    }
    
    @Override
    public boolean usuarioCorrecto(String usu, String clave){
        Usuario usuario = new Usuario();
        usuario.setUsuario(usu);
        usuario.setContrasena(clave);
        return uSBLocal.existeUsuario(usuario);
        
    }
    
    
}
