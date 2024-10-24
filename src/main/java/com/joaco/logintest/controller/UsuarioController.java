package com.joaco.logintest.controller;

import com.joaco.logintest.entity.Usuario;
import com.joaco.logintest.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registro")
    public String registro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrar(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/login?success";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome"; // Retorna la vista de bienvenida
    }
}
