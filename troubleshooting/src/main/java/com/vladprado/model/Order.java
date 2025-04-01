package com.vladprado.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Order extends PanacheEntity {
    @Column(nullable = false)
    public String customerName;

    // BUG: Missing order_date column!
    // public LocalDate orderDate;
}
