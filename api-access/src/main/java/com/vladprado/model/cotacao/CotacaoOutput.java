package com.vladprado.model.cotacao;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class CotacaoOutput {

    @JsonProperty("@odata.context")
    private String dataContext;

    private CotacaoDia[] value;

    public CotacaoDia[] getValue() {
        return value;
    }

    public void setValue(CotacaoDia[] value) {
        this.value = value;
    }

    public String getDataContext() {
        return dataContext;
    }

    public void setDataContext(String dataContext) {
        this.dataContext = dataContext;
    }

    @Override
    public String toString() {
        return "CotacaoOutput{" +
                "dataContext='" + dataContext + '\'' +
                ", cotacaoDia=" + value.toString() +
                '}';
    }
}
