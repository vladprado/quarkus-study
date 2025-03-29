package com.vladprado.model;

import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigDecimal;
import java.util.Arrays;


@ApplicationScoped
public class Transaction {
    String id;
    String amount;
    String currency;
    String status;
    Discount discount;
    Fee[] fees;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fee[] getFees() {
        return fees;
    }

    public void setFees(Fee[] fees) {
        this.fees = fees;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", discount=" + discount +
                ", fees=" + Arrays.toString(fees) +
                '}';
    }
}
