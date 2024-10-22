package com.joaco.logintest.controller;

import com.joaco.logintest.service.UsuarioService;
import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
