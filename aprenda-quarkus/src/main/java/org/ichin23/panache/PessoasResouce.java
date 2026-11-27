package org.ichin23.panache;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import java.util.List;

@Path("/pessoas")
public class PessoasResouce {

    @Inject
    PessoaRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> listAll(){
        return Pessoa.listAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa findPessoaById(@PathParam("id") Long id){
        Pessoa pessoa = Pessoa.findById(id);
        if (pessoa == null) {
            throw new WebApplicationException("Pessoa not found", 404);
        }
        return pessoa;
    }

    @GET
    @Path("/nome")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> findPessoaByName(@QueryParam("nome") String nome){
        return Pessoa.find("nome", nome).list();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Pessoa createPessoa(@RequestBody IncluirPessoaDTO pessoa){
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(pessoa.getNome());
        novaPessoa.setTipo(pessoa.getTipo());
        novaPessoa.persist();

        return novaPessoa;
    }
}
