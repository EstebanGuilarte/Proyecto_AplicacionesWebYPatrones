package com.turistico.controller;

import com.turistico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String inicio(Model model) {

        var usuarios = usuarioService.getUsuarios();

        model.addAttribute("usuarios", usuarios);

        return "index";
    }
}
