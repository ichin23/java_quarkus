package org.ichin23;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class UnidadeFederativa implements Serializable {
    Integer id;

    String sigla;

    String nome;

    public UnidadeFederativa(Integer id, String sigla, String nome){
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<UnidadeFederativa> getUfs(){
        ArrayList<UnidadeFederativa> ufs = new ArrayList<>();

        ufs.add(new UnidadeFederativa(1, "MG", "Minas Gerais"));
        ufs.add(new UnidadeFederativa(2, "RJ", "Rio de Janeiro"));
        ufs.add(new UnidadeFederativa(3, "PE", "Pernambuco"));
        ufs.add(new UnidadeFederativa(4, "PB", "Paraíba"));

        return ufs;
    }

}
