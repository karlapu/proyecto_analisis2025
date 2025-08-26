package com.dbproject.analisis.dos.model.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sucursal") 
@Data

public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSucursal;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Direccion", nullable = false, length = 200)
    private String direccion;

    @Column(name = "IdEmpresa", nullable = false)
    private Integer idEmpresa;

    @Column(name = "FechaCreacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "UsuarioCreacion", nullable = false, length = 100)
    private String usuarioCreacion;

    @Column(name = "FechaModificacion")
    private Date fechaModificacion;

    @Column(name = "UsuarioModificacion", length = 100)
    private String usuarioModificacion;
    
}