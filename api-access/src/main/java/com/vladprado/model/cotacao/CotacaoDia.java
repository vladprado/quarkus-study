package com.vladprado.model.cotacao;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class CotacaoDia {
    private float cotacaoCompra;
    private float cotacaoVenda;
    private String dataHoraCotacao;

    public String getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(String dataHoraCotacao) {
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
