package com.example.records.api.controller;

import com.example.records.api.dto.Anything;
import com.example.records.api.dto.RequestToSaveAnything;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("anythings")
public class AnythingController {

    private final List<Anything> anythings = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Anything>> getAll() {
        return ResponseEntity.ok(anythings);
    }

    @ResponseStatus(CREATED)
    @PostMapping
    public void save(@Valid @RequestBody RequestToSaveAnything request) {
        var anything = new Anything(request.name());
        anythings.add(anything);
    }

    @ResponseStatus(CREATED)
    @PostMapping("mistery")
    public void saveMistery() {
        anythings.add(Anything.mistery());
    }
}
