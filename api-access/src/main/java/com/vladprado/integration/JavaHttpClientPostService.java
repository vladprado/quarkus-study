package com.vladprado.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.vladprado.model.cotacao.CotacaoDia;
import com.vladprado.model.cotacao.CotacaoOutput;
import jakarta.enterprise.context.ApplicationScoped;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

@ApplicationScoped
public class JavaHttpClientPostService {
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public JavaHttpClientPostService() {
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public ArrayList<CotacaoDia> buscaCotacaoDia() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)?@dataCotacao='03-28-2024'&$format=json"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            CotacaoOutput output = objectMapper.readValue(response.body(), new TypeReference<CotacaoOutput>() {});
            System.out.println(output.getDataContext());
            return output.getValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
