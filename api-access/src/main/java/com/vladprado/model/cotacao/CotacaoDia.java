package com.vladprado.model.cotacao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.RequestScoped;

import java.time.LocalDateTime;

@RegisterForReflection
@RequestScoped
public class CotacaoDia {
    private float cotacaoCompra;
    private float cotacaoVenda;

    @JsonProperty("dataHoraCotacao")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime dataHoraCotacao;

    public LocalDateTime getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(LocalDateTime dataHoraCotacao) {
        this.dataHoraCotacao = dataHoraCotacao;
    }

    public float getCotacaoVenda() {
        return cotacaoVenda;
    }

    public void setCotacaoVenda(float cotacaoVenda) {
        this.cotacaoVenda = cotacaoVenda;
    }

    public float getCotacaoCompra() {
        return cotacaoCompra;
    }

    public void setCotacaoCompra(float cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
    }

    @Override
    public String toString() {
        return "CotacaoDia{" +
                "cotacaoCompra=" + cotacaoCompra +
                ", cotacaoVenda=" + cotacaoVenda +
                ", timestamp=" + dataHoraCotacao +
                '}';
    }
}
