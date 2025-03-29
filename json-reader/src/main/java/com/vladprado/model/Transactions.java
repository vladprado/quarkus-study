package com.vladprado.model;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class Transactions {
    Transaction[] transactions;

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transactions=" + Arrays.toString(transactions) +
                '}';
    }
}
