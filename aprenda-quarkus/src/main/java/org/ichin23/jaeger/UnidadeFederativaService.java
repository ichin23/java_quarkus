package org.ichin23.jaeger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@ApplicationScoped
@RegisterRestClient
@Path("ufs")
public interface UnidadeFederativaService {

    @Produces(value = MediaType.APPLICATION_JSON)
    public List<UnidadeFederativa> getUfs();

    @GET
    @Path("/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public UnidadeFederativa getUF(@PathParam("id") Long id);
}
