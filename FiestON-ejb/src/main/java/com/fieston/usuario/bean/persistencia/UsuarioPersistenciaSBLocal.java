/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.usuario.bean.persistencia;

import com.fieston.usuario.entity.Usuario;
import javax.ejb.Local;

/**
 *
 * @author Rodrigo
 */
@Local
public interface UsuarioPersistenciaSBLocal {
     public void agregarUsuario(Usuario usuario);
     public boolean existeUsuario(Usuario usuario);
}
