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

import com.dbproject.analisis.dos.model.entity.StatusUsuario;
import com.dbproject.analisis.dos.service.StatusUsuarioService;


@RestController
@RequestMapping("/backend/status-usuarios")

public class StatusUsuarioController {

    private final StatusUsuarioService service;

    public StatusUsuarioController(StatusUsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<StatusUsuario>> getAllStatusUsuarios() {
        List<StatusUsuario> statusList = service.findAll();
        return ResponseEntity.ok(statusList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusUsuario> getStatusUsuarioById(@PathVariable Integer id) {
        StatusUsuario status = service.findById(id);
        if (status != null) {
            return ResponseEntity.ok(status);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<StatusUsuario> createStatusUsuario(@RequestBody StatusUsuario s) {
        StatusUsuario nuevo = service.create(s);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StatusUsuario> updateStatusUsuario(@PathVariable Integer id, @RequestBody StatusUsuario s) {
        StatusUsuario actualizado = service.update(id, s);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStatusUsuario(@PathVariable Integer id) {
        StatusUsuario status = service.findById(id);
        if (status != null) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}