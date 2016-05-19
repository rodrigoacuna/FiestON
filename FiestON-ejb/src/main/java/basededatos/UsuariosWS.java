/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import com.fieston.usuario.bean.persistencia.UsuarioPersistenciaSBLocal;
import com.fieston.usuario.entity.Usuario;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Rodrigo
 */

@ApplicationPath("resources")
@Path("usuario")

public class UsuariosWS {

    @EJB
    private UsuarioPersistenciaSBLocal ejbRef;
    
    
    @POST
    public void agregarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        ejbRef.agregarUsuario(usuario);
    }

    @POST
    public boolean existeUsuario(@WebParam(name = "usuario") Usuario usuario) {
        return ejbRef.existeUsuario(usuario);
    }
    @GET
    public ArrayList<Usuario> retornoUsuarios() {
        return ejbRef.retornoUsuarios();
    }
}
