package com.springedu.manager.controller;

import com.springedu.manager.model.Estudiante;
import com.springedu.manager.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EduController {
    
    @Autowired
    private EduService service;

    // NUEVO: Si alguien entra a "localhost:8081", lo enviamos a "/estudiantes"
    @GetMapping("/")
    public String inicio() {
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes")
    public String verEstudiantes(Model model) {
        model.addAttribute("estudiantes", service.listarEstudiantes());
        // Mandamos la lista de cursos a la vista HTML
        model.addAttribute("cursos", service.listarCursos()); 
        return "estudiantes"; 
    }

    @PostMapping("/estudiantes/guardar")
    public String guardarEst(@ModelAttribute Estudiante est) {
        service.guardarEstudiante(est);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/eliminar/{id}")
    public String eliminarEst(@PathVariable Long id) {
        service.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }
}
