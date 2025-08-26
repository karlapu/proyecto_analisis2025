package com.dbproject.analisis.dos.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRole;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "FechaCreacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "UsuarioCreacion", nullable = false, length = 100)
    private String usuarioCreacion;

    @Column(name = "FechaModificacion")
    private Date fechaModificacion;

    @Column(name = "UsuarioModificacion", length = 100)
    private String usuarioModificacion;
    
}
