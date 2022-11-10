package com.turistico.controller;

import com.turistico.domain.Usuario;
import com.turistico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    //CRUD
    @GetMapping("/usuario/nuevo")
    public String usuarioNuevo(Usuario usuario) {
        return "/registro/registro";
    }

    @PostMapping("/usuario/guardar")
     public String usuarioGuardar(Usuario usuario) {
        usuarioService.save(usuario);
        return "/paginaPrincipal/index";
    }

    @GetMapping("/usuario/actualiza/{idUsuario}")
    public String usuarioActualiza(Usuario usuario, Model model) {
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/registro/registro";

    }

    @GetMapping("/usuario/elimina/{idUsuario}")
    public String usuarioElimina(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/";

    }
    //NAVIGATION
    
}
