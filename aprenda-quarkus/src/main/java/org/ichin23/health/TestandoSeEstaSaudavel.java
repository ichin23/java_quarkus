package org.ichin23.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class TestandoSeEstaSaudavel implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("testando-se-esta-saudavel").up().build();
    }
}
