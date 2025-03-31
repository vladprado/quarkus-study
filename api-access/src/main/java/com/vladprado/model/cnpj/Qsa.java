package com.vladprado.model.cnpj;

public class Qsa {
    String nome;
    String qual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    @Override
    public String toString() {
        return "Qsa{" +
                "nome='" + nome + '\'' +
                ", qual='" + qual + '\'' +
                '}';
    }
}
