package com.dbproject.analisis.dos.service;

import java.util.List;

import com.dbproject.analisis.dos.model.entity.Sucursal;


public interface SucursalService {

    List<Sucursal> findAll();

    Sucursal findById(Integer id);

    Sucursal create(Sucursal s);

    Sucursal update(Integer id, Sucursal s);

    void delete(Integer id);

}
