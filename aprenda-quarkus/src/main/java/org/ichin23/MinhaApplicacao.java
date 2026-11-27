package org.ichin23;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.security.OAuthFlow;
import org.eclipse.microprofile.openapi.annotations.security.OAuthFlows;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;

@OpenAPIDefinition(info = @Info(description = "Conjunto endpoints usados para aprender quarkus", title = "AprendaQuarkus", version = "0.0.1", contact = @Contact(name = "Pedro Manoel", email = "pedro.manoel@pdcase.com.br")))
@SecurityScheme(securitySchemeName = "quarkus-oauth", type = SecuritySchemeType.OAUTH2, flows = @OAuthFlows(password = @OAuthFlow(tokenUrl = "http://localhost:8100/realms/quarkus/protocol/openid-connect/token")))
public class MinhaApplicacao extends Application {
}
