package com.dbproject.analisis.dos.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @Column(name = "IdUsuario", length = 100)
    private String idUsuario;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    @Column(name = "FechaNacimiento", nullable = false)
    private Date fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "IdStatusUsuario", nullable = false)
    private StatusUsuario statusUsuario;

    @Column(name = "Password", nullable = false, length = 100)
    private String password;

    @ManyToOne
    @JoinColumn(name = "IdGenero", nullable = false)
    private Genero genero;

    @Column(name = "UltimaFechaIngreso")
    private Date ultimaFechaIngreso;

    @Column(name = "IntentosDeAcceso")
    private Integer intentosDeAcceso;

    @Column(name = "SesionActual", length = 100)
    private String sesionActual;

    @Column(name = "UltimaFechaCambioPassword")
    private Date ultimaFechaCambioPassword;

    @Column(name = "CorreoElectronico", length = 100)
    private String correoElectronico;

    @Column(name = "RequiereCambiarPassword")
    private Integer requiereCambiarPassword;

    @Lob
    @Column(name = "Fotografia")
    private byte[] fotografia;

    @Column(name = "TelefonoMovil", length = 30)
    private String telefonoMovil;

    @ManyToOne
    @JoinColumn(name = "IdSucursal", nullable = false)
    private Sucursal sucursal;

    @Column(name = "Pregunta", nullable = false, length = 200)
    private String pregunta;

    @Column(name = "Respuesta", nullable = false, length = 200)
    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "IdRole", nullable = false)
    private Role role;

    @Column(name = "FechaCreacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "UsuarioCreacion", nullable = false, length = 100)
    private String usuarioCreacion;

    @Column(name = "FechaModificacion")
    private Date fechaModificacion;

    @Column(name = "UsuarioModificacion", length = 100)
    private String usuarioModificacion;
}

