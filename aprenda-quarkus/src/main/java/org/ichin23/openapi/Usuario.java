package org.ichin23.openapi;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDateTime;

public class Usuario extends PanacheEntity {

    @Schema(description = "Nome completo do usuário", required = true)
    private String nome;

    @Schema(minimum = "0", exclusiveMinimum = true, description = "")
    private Long idade;

    @Schema(hidden = true)
    private LocalDateTime dataAtualizacaoDados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public LocalDateTime getDataAtualizacaoDados() {
        return dataAtualizacaoDados;
    }

    public void setDataAtualizacaoDados(LocalDateTime dataAtualizacaoDados) {
        this.dataAtualizacaoDados = dataAtualizacaoDados;
    }
}
