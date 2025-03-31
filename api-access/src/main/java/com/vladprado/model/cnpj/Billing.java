package com.vladprado.model.cnpj;

public class Billing {
    Boolean free;
    Boolean database;

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Boolean getDatabase() {
        return database;
    }

    public void setDatabase(Boolean database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "free=" + free +
                ", database=" + database +
                '}';
    }
}
