package com.vladprado.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vladprado.model.Fee;
import com.vladprado.model.Transaction;
import com.vladprado.model.Transactions;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Path("/hello")
public class GreetingResource {

    @Inject
    private Transactions transactions;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {
        StringBuilder json = new StringBuilder();
        try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("transactions.json")){
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readValue(in, JsonNode.class);
            transactions = mapper.treeToValue(jsonNode, Transactions.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<Transaction> transactionList = Arrays.asList(transactions.getTransactions());
        for (Transaction transaction : transactionList) {
            System.out.println(transaction);
            if(transaction.getFees() != null) {
                for (Fee fee : transaction.getFees()) {
                    System.out.println(fee.toString());
                }
            }
        }

        return "Hello from Quarkus REST";
    }
}
