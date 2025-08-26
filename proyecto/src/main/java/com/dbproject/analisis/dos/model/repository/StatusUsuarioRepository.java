package com.dbproject.analisis.dos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbproject.analisis.dos.model.entity.StatusUsuario;


public interface StatusUsuarioRepository extends JpaRepository<StatusUsuario, Integer> {
}