package org.ichin23.hibernate;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class ProdutosService {

    @Inject
    EntityManager entityManager;



    public List<Produto> getProdutos(){
        return entityManager.createQuery("select p from Produto p", Produto.class).getResultList();
    }

    public Produto createProduto(Produto p){
        entityManager.persist(p);
        return p;
    }
}
