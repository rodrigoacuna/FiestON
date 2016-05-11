/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import com.fieston.usuario.entity.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class UsuariosBD {
    
    private static UsuariosBD listas;
    
    private ArrayList<Usuario> usuarios;

    public static UsuariosBD getInstance(){
        
        if(listas.listas == null){
            return new UsuariosBD();
        }else{
            return listas.listas;
        }
    
    }
    
    private UsuariosBD(){
        this.usuarios = new ArrayList<>();
    }
    private UsuariosBD(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    
    public boolean existeUSuario(Usuario usuario){
        return this.usuarios.contains(usuario);
    }
    
    
}
