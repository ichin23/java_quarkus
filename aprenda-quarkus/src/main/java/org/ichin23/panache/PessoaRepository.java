package org.ichin23.panache;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class PessoaRepository implements PanacheRepository<Pessoa> {

}
