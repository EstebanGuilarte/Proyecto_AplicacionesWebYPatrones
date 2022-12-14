package com.turistico.service;

import com.turistico.domain.Reserva;
import java.util.List;

public interface ReservaService {

    public List<Reserva> getReservas();

    public Reserva getReserva(Reserva reserva);

    public void save(Reserva reserva);

    public void delete(Reserva reserva);
}
