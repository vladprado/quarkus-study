package com.vladprado.model;

public class Fee {
    String type;
    float value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
