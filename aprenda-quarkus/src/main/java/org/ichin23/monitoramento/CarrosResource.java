package org.ichin23.monitoramento;

import io.micrometer.core.annotation.Counted;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/carros")
public class CarrosResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Counted("contador busca carros")
    public String method(){
        return "olá";
    }
}
