package org.ichin23.openapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;

import java.util.List;

@Path("/usuarios")
public class UsuariosResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
        summary = "Busca todos os usuário",
        description = "Busca todos os usuários, mesmo que tenham sido apagados logicamente"
    )
    public List<Usuario> findUsuarios(){
        return Usuario.findAll().list();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario createUsuario(Usuario usuario){
        usuario.persist();
        return usuario;
    }


}
