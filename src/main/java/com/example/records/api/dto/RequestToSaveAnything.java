package com.example.records.api.dto;

import jakarta.validation.constraints.NotBlank;

public record RequestToSaveAnything(@NotBlank String name) {
}
