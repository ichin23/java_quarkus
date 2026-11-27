package org.ichin23.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.oidc.IdToken;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa extends PanacheEntity {

    private String nome;
    private Tipo tipo;

    public enum Tipo {
        PJ,
        PF
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
