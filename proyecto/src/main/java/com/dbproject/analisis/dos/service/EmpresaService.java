package com.dbproject.analisis.dos.service;

import java.util.List;

import com.dbproject.analisis.dos.model.entity.Empresa;


public interface EmpresaService {

    List<Empresa> findAll();

    Empresa findById(Integer id);

    Empresa create(Empresa e);

    Empresa update(Integer id, Empresa e);

    void delete(Integer id);
}