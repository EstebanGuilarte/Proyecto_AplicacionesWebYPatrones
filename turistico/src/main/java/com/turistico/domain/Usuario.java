package com.turistico.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombreUsuario;
    private String apellidosUsuario;
    private String correoElectronico;
    private String contrasena;

    public Usuario(String nombreUsuario, String apellidosUsuario, String correoElectronico, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    public Usuario() {
    }
}
