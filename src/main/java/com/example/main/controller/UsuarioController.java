package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ftana
 */
@Controller
public class UsuarioController {
    
    @GetMapping("/perfil")
    public String perfil(Model model){
        model.addAttribute("nome", "Fabio Tanaka");
        model.addAttribute("curso", "Tecnico em Desenv. de Sistemas");
        model.addAttribute("linguagemFavorita", "Python");
        return "perfil";
    }
}
