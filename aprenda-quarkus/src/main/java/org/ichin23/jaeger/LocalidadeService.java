package org.ichin23.jaeger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class LocalidadeService {

    @Inject
    EntityManager entityManager;

    @Inject
    @RestClient
    UnidadeFederativaService ufService;

    public List<Municipio> getMunicipios(){
        return entityManager.createQuery("SELECT m FROM Municipio m", Municipio.class)
                .getResultList();
    }

    public void addMunicipio(Municipio m){
        entityManager.persist(m);
    }

    public UnidadeFederativa getUf(Long id){
        return ufService.getUF(id);
    }
}
