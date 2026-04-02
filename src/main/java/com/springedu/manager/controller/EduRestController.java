package com.springedu.manager.controller;

import com.springedu.manager.model.Curso;
import com.springedu.manager.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EduRestController {
    @Autowired
    private EduService service;

    @GetMapping("/cursos") // Endpoint solicitado 
    public List<Curso> obtenerCursos() {
        return service.listarCursos();
    }
}
