package com.turistico.dao;

import com.turistico.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDao extends JpaRepository<Reserva,Long>{
    
}
