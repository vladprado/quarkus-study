package com.vladprado.service;

import com.vladprado.integration.JavaHttpClientPostService;
import com.vladprado.model.cotacao.CotacaoDia;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;

@ApplicationScoped
public class GreetingService {

    @Inject
    private JavaHttpClientPostService httpClientPostService;

    public String sayHello() {
        exchangeRatesAPI();
        return "Hello!";
    }

    private void exchangeRatesAPI() {
        System.out.println("Oi");
        ArrayList<CotacaoDia> cotacaoDia = httpClientPostService.buscaCotacaoDia();
        for(CotacaoDia cotacao: cotacaoDia) {
            System.out.println(cotacao.toString());
        }
        System.out.println("Tchau");
    }

    private void companyInfoAPI() {}

    private void demographicAPI() {}
}
