package com.vladprado.service;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class GreetingService {
    public String sayHello() {
        return "Hello!";
    }

    private void exchangeRatesAPI() {}

    private void companyInfoAPI() {}

    private void demographicAPI() {}
}
