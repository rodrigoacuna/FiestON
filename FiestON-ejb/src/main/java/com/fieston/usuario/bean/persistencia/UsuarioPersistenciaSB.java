/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.usuario.bean.persistencia;

import basededatos.UsuariosBD;
import com.fieston.usuario.entity.Usuario;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author Rodrigo
 */
@Stateless
public class UsuarioPersistenciaSB implements UsuarioPersistenciaSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public UsuariosBD lista;

    public UsuarioPersistenciaSB() {
        init();
    }
    
    
    @PostConstruct
    private void init(){
        lista = UsuariosBD.getInstance();
        
        /**** AGREGAMOS USUARIOS A LA 'BASE DE DATOS' ****/
        Usuario cata = new Usuario("cata", "cata", "cata@mail.com");
        Usuario rodri = new Usuario("rodri", "rodri", "rodri@mail.com");
        Usuario nico = new Usuario("nico", "nico", "nico@mail.com");
        
        this.lista.agregarUsuario(cata);
        this.lista.agregarUsuario(rodri);
        this.lista.agregarUsuario(nico);
        
    }
    
    @Override
    public void agregarUsuario(Usuario usuario){
       lista.agregarUsuario(usuario);
        System.out.println(usuario.toString());

    }
    
    
     @Override
    public boolean existeUsuario(Usuario usuario){
        return lista.existeUSuario(usuario);

    }
    
    
}
