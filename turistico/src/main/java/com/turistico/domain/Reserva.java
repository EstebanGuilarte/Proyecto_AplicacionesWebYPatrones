package com.turistico.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reserva")
public class Reserva implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private String nombreReserva;
    private String apellidosReserva;
    private String telefonoReserva;
    private int dias;
    private int personas;

    public Reserva(String nombreReserva, String apellidosReserva, String telefonoReserva, int dias, int personas) {
        this.nombreReserva = nombreReserva;
        this.apellidosReserva = apellidosReserva;
        this.telefonoReserva = telefonoReserva;
        this.dias = dias;
        this.personas = personas;
    }

    public Reserva() {
    }
}
