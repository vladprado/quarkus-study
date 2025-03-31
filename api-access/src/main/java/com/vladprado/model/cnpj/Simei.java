package com.vladprado.model.cnpj;

public class Simei {
    Boolean optante;
    String data_opcao;
    String data_exclusao;
    String ultima_atualizacao;

    public Boolean getOptante() {
        return optante;
    }

    public void setOptante(Boolean optante) {
        this.optante = optante;
    }

    public String getData_opcao() {
        return data_opcao;
    }

    public void setData_opcao(String data_opcao) {
        this.data_opcao = data_opcao;
    }

    public String getData_exclusao() {
        return data_exclusao;
    }

    public void setData_exclusao(String data_exclusao) {
        this.data_exclusao = data_exclusao;
    }

    public String getUltima_atualizacao() {
        return ultima_atualizacao;
    }

    public void setUltima_atualizacao(String ultima_atualizacao) {
        this.ultima_atualizacao = ultima_atualizacao;
    }

    @Override
    public String toString() {
        return "Simei{" +
                "optante=" + optante +
                ", data_opcao='" + data_opcao + '\'' +
                ", data_exclusao='" + data_exclusao + '\'' +
                ", ultima_atualizacao='" + ultima_atualizacao + '\'' +
                '}';
    }
}
