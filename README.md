# 🎓 SpringEdu Manager

Aplicación web educativa desarrollada en Java utilizando el ecosistema de Spring, diseñada para gestionar estudiantes, cursos y evaluaciones en una sola plataforma. Proyecto final para el Módulo 6: Desarrollo de aplicaciones JEE con Spring Framework.

## 🚀 Tecnologías Utilizadas

* **Java 17/21**
* **Spring Boot 3.x** (Estructura y Auto-configuración)
* **Spring MVC & Thymeleaf** (Arquitectura web y renderizado de vistas)
* **Spring Data JPA & Hibernate** (Persistencia de datos)
* **Spring Security** (Autenticación y autorización por roles)
* **MySQL** (Base de datos relacional)
* **Maven** (Gestor de dependencias)
* **Bootstrap 5** (Diseño y UI)

## ⚙️ Funcionalidades

1.  **Gestión de Estudiantes (CRUD):** Creación, lectura y eliminación de registros de estudiantes.
2.  **Seguridad por Roles:** Acceso restringido. Solo administradores autorizados pueden gestionar la información.
3.  **API REST:** Interoperabilidad asegurada exponiendo endpoints RESTful (JSON) para integraciones externas.

## 🛠️ Instalación y Uso

1.  Clonar el repositorio.
2.  Crear una base de datos en MySQL llamada `springedu_db`.
3.  Configurar credenciales en `src/main/resources/application.properties`.
4.  Ejecutar el proyecto con `mvn spring-boot:run`.
5.  Acceder a `http://localhost:8080/estudiantes` con las credenciales por defecto (`admin` / `admin123`).