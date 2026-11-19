package org.ichin23.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@ApplicationScoped
public class TestandoSeEstaSaudavel3 implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("testando banco de dados 2").up().build();
    }
}
