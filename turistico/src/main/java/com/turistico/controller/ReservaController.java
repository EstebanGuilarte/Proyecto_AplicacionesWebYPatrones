package com.turistico.controller;

import com.turistico.domain.Reserva;
import com.turistico.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;
    
    //CRUD
    @GetMapping("/reserva/nuevo")
    public String reservaNuevo(Reserva reserva) {
        return "/registro/registro";
    }

    @PostMapping("/reserva/guardar")
     public String reservaGuardar(Reserva reserva) {
        reservaService.save(reserva);
        return "/paginaPrincipal/index";
    }

    @GetMapping("/reserva/actualiza/{idReserva}")
    public String reservaActualiza(Reserva reserva, Model model) {
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "/registro/registro";

    }

    @GetMapping("/reserva/elimina/{idReserva}")
    public String reservaElimina(Reserva reserva) {
        reservaService.delete(reserva);
        return "redirect:/";

    }
    //NAVIGATION
    
}
