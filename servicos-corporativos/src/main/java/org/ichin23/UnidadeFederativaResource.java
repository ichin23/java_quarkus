package org.ichin23;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/ufs")
@Transactional
public class UnidadeFederativaResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<UnidadeFederativa> getAllUfs(){
        return UnidadeFederativa.getUfs();
    }

    @GET
    @Path("/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public UnidadeFederativa getUfById(@PathParam("id") Integer id){

        if(id.equals(-2)){
            throw new NullPointerException();
        }

        return UnidadeFederativa.getUfs().stream()
                .filter(uf -> uf.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}