package org.ichin23.jaeger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Municipio {

    @Id
    private Long id;

    private String nome;
    private Long idUF;

    public Municipio(Long id, String nome, Long idUf){
        this.id=id;
        this.nome = nome;
        this.idUF = idUf;
    }

    public Municipio(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdUF() {
        return idUF;
    }

    public void setIdUF(Long idUF) {
        this.idUF = idUF;
    }
}
