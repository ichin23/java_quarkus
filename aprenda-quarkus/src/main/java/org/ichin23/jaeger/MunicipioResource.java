package org.ichin23.jaeger;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("municipios")
public class MunicipioResource {

    @Inject LocalidadeService localidadeService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Municipio> getAllMunicipios(){
        return localidadeService.getMunicipios();
    }

    @GET
    @Path("/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Municipio getMunicipio(@PathParam("id") Long id) {
        return localidadeService.getMunicipios().stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }

    @GET
    @Path("/{idMunicipio}/uf")
    @Produces(value = MediaType.APPLICATION_JSON)
    public UnidadeFederativa getUf(@PathParam("idMunicipio") Long idMunicipio) {
        return localidadeService.getUf(idMunicipio);
    }


}
