package com.vladprado.service;

import com.vladprado.integration.JavaHttpClientPostService;
import com.vladprado.model.cnpj.InfoGeralCnpj;
import com.vladprado.model.cotacao.CotacaoDia;
import com.vladprado.model.ibge.EstadosInfo;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@ApplicationScoped
public class GreetingService {

    @Inject
    private JavaHttpClientPostService httpClientPostService;

    public String sayHello() {
        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> exchangeRatesAPI(), executor);
            CompletableFuture<Void> task2 = CompletableFuture.runAsync(() -> companyInfoAPI(), executor);
            CompletableFuture<Void> task3 = CompletableFuture.runAsync(() -> demographicAPI(), executor);

            CompletableFuture.allOf(task1, task2, task3).join();
        }
        return "Hello!";
    }

    private void exchangeRatesAPI() {
        System.out.println("busca api BC" + LocalDateTime.now());
        ArrayList<CotacaoDia> cotacaoDia = httpClientPostService.buscaCotacaoDia();
        for(CotacaoDia cotacao: cotacaoDia) {
            System.out.println(cotacao.toString());
        }
        System.out.println("fim api BC" + LocalDateTime.now());
    }

    private void companyInfoAPI() {
        System.out.println("Busca api Cnpj" + LocalDateTime.now());
        InfoGeralCnpj infoGeralCnpj = httpClientPostService.buscaInfoCnpj();
        System.out.println(infoGeralCnpj);
        System.out.println("Fim api Cnpj" + LocalDateTime.now());
    }

    private void demographicAPI() {
        System.out.println("Busca api IBGE" + LocalDateTime.now());
        ArrayList<EstadosInfo> estadosInfo = httpClientPostService.getEstados();
        for (EstadosInfo estado: estadosInfo) {
            System.out.println(estado.toString());
        }
        System.out.println("fim api IBGE" + LocalDateTime.now());
    }
}
