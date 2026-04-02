package com.springedu.manager;

import com.springedu.manager.model.Curso;
import com.springedu.manager.service.EduService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringEduManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEduManagerApplication.class, args);
    }

    @Bean
    public CommandLineRunner inicializarDatos(EduService service) {
        return args -> {

            if (service.listarCursos().isEmpty()) {
                
                // Arreglo para Educación Básica
                String[] basicos = {"1° Básico", "2° Básico", "3° Básico", "4° Básico", "5° Básico", "6° Básico", "7° Básico", "8° Básico"};
                for (String nombre : basicos) {
                    Curso c = new Curso();
                    c.setNombre(nombre);
                    c.setDescripcion("Educación General Básica");
                    service.guardarCurso(c);
                }

                // Arreglo para Educación Media
                String[] medios = {"1° Medio", "2° Medio", "3° Medio", "4° Medio"};
                for (String nombre : medios) {
                    Curso c = new Curso();
                    c.setNombre(nombre);
                    c.setDescripcion("Educación Media");
                    service.guardarCurso(c);
                }
            }
        };
    }
}
