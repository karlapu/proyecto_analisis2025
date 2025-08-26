package com.dbproject.analisis.dos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbproject.analisis.dos.model.entity.Empresa;


public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}