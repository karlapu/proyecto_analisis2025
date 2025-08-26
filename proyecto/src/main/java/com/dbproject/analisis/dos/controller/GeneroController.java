package com.dbproject.analisis.dos.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbproject.analisis.dos.model.entity.Genero;
import com.dbproject.analisis.dos.service.GeneroService;



@RestController
@RequestMapping("/backend/generos")

public class GeneroController {

    private final GeneroService service;

    public GeneroController(GeneroService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Genero>> getAllGeneros() {
        List<Genero> generos = service.findAll();
        return ResponseEntity.ok(generos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> getGeneroById(@PathVariable Integer id) {
        Genero genero = service.findById(id);
        if (genero != null) {
            return ResponseEntity.ok(genero);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Genero> createGenero(@RequestBody Genero g) {
        Genero nuevoGenero = service.create(g);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoGenero);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genero> updateGenero(@PathVariable Integer id, @RequestBody Genero g) {
        Genero actualizado = service.update(id, g);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenero(@PathVariable Integer id) {
        Genero genero = service.findById(id);
        if (genero != null) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}