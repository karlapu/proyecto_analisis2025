package com.dbproject.analisis.dos.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "empresa")
@Data
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Direccion", nullable = false, length = 200)
    private String direccion;

    @Column(name = "Nit", nullable = false, length = 20)
    private String nit;

    @Column(name = "PasswordCantidadMayusculas")
    private Integer passwordCantidadMayusculas;

    @Column(name = "PasswordCantidadMinusculas")
    private Integer passwordCantidadMinusculas;

    @Column(name = "PasswordCantidadCaracteresEspeciales")
    private Integer passwordCantidadCaracteresEspeciales;

    @Column(name = "PasswordCantidadCaducidadDias")
    private Integer passwordCantidadCaducidadDias;

    @Column(name = "PasswordLargo")
    private Integer passwordLargo;

    @Column(name = "PasswordIntentosAntesDeBloquear")
    private Integer passwordIntentosAntesDeBloquear;

    @Column(name = "PasswordCantidadNumeros")
    private Integer passwordCantidadNumeros;

    @Column(name = "PasswordCantidadPreguntasValidar")
    private Integer passwordCantidadPreguntasValidar;

    @Column(name = "FechaCreacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "UsuarioCreacion", nullable = false, length = 100)
    private String usuarioCreacion;

    @Column(name = "FechaModificacion")
    private Date fechaModificacion;

    @Column(name = "UsuarioModificacion", length = 100)
    private String usuarioModificacion;  
    
}
