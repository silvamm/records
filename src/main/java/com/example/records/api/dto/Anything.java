package com.example.records.api.dto;

public record Anything(String name) {
    public static Anything mistery() {
        return new Anything("A mistery");
    }
}
