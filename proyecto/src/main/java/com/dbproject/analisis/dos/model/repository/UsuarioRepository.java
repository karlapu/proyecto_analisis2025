package com.dbproject.analisis.dos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbproject.analisis.dos.model.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}