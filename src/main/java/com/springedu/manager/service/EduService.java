package com.springedu.manager.service;

import com.springedu.manager.model.*;
import com.springedu.manager.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EduService {
    @Autowired
    private EstudianteRepository estRepo;
    @Autowired
    private CursoRepository cursoRepo;

    public List<Estudiante> listarEstudiantes() { return estRepo.findAll(); }
    public void guardarEstudiante(Estudiante e) { estRepo.save(e); }
    
    public void eliminarEstudiante(Long id) { estRepo.deleteById(id); }
    
    public List<Curso> listarCursos() { return cursoRepo.findAll(); }
    public void guardarCurso(Curso c) { cursoRepo.save(c); }
}