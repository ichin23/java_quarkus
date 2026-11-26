package org.ichin23.keycloak;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.security.OAuthFlow;
import org.eclipse.microprofile.openapi.annotations.security.OAuthFlows;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;

@Path("/computadores")
public class ComputadoresResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String publico(){
        return "hello publico";
    }

    @GET
    @Path("/privado")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("user")
    @SecurityRequirement(name = "quarkus-oauth")
    public String privado(){
        return "hello privado ";
    }
}
