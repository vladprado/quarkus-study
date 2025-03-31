package com.vladprado.model.cnpj;

public class AtividadesSecundarias {
    String code;
    String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "AtividadesSecundarias{" +
                "code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
