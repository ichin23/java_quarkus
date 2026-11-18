package org.ichin23.hibernate;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/produtos")
@Transactional
public class ProdutosResource {

    @Inject
    ProdutosService produtosService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Produto> getProdutos(){
        return produtosService.getProdutos();
    }


    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Produto createProduto(Produto p){
        return produtosService.createProduto(p);
    }
}
