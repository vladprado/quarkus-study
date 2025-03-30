package com.vladprado.service;

import com.vladprado.integration.JavaHttpClientPostService;
import com.vladprado.model.cotacao.CotacaoDia;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService {

    @Inject
    private JavaHttpClientPostService httpClientPostService;

    public String sayHello() {
        exchangeRatesAPI();
        return "Hello!";
    }

    private void exchangeRatesAPI() {
        CotacaoDia[] cotacaoDia = httpClientPostService.buscaCotacaoDia();
        cotacaoDia.toString();
    }

    private void companyInfoAPI() {}

    private void demographicAPI() {}
}
