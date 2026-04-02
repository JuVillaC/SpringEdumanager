# 🎓 SpringEdu Manager - Sistema de Ingreso de Estudiantes

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.4-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)

### 📝 Descripción
**SpringEdu Manager** es una solución integral para la gestión académica, diseñada específicamente para el contexto educativo chileno. Permite la administración de los estudiantes desde **1° Básico hasta 4° Medio**, integrando seguridad avanzada, persistencia de datos relacional y una interfaz de usuario moderna y responsiva basada en Bootstrap 5.

---

## 📺 Demostración en Video
Puedes ver el funcionamiento completo de la aplicación (Login, CRUD, Relaciones y API REST) en el siguiente enlace:

👉 **[Ver Video de Demostración en YouTube](PONE_AQUÍ_EL_LINK_DE_TU_VIDEO)**

---

## ✨ Características Principales
* 👤 **Gestión de Estudiantes (CRUD):** Registro completo, listado dinámico y eliminación de registros.
* 🏫 **Sistema de Niveles Académicos:** Implementación relacional `@ManyToOne` con cursos de 1° Básico a 4° Medio.
* 🔒 **Seguridad Robusta:** Autenticación y autorización mediante **Spring Security** con protección de rutas.
* 🌐 **API RESTful:** Exposición de datos de cursos en formato JSON para interoperabilidad.
* 🎨 **UI Profesional:** Interfaz diseñada con **Bootstrap 5**, incluyendo iconos de **Bootstrap Icons** y alertas de confirmación.

---

## 🛠️ Stack Tecnológico

| Capa | Tecnología |
| :--- | :--- |
| **Lenguaje** | Java 21 |
| **Framework Principal** | Spring Boot 3.2.4 |
| **Persistencia** | Spring Data JPA / Hibernate |
| **Base de Datos** | MySQL |
| **Seguridad** | Spring Security (In-Memory Auth) |
| **Motor de Plantillas** | Thymeleaf |
| **Frontend UI** | Bootstrap 5 + Bootstrap Icons |

---

## ⚙️ Configuración e Instalación

### 1. Requisitos Previos
* Java JDK 21 o superior.
* MySQL Server activo.
* Maven instalado (o uso del `mvnw` incluido).

### 2. Base de Datos
Crea la base de datos en tu terminal MySQL o Workbench:
```sql
CREATE DATABASE springedu_db;
```

### 3. Propiedades del proyecto
Ajusta el archivo src/main/resources/application.properties con tus credenciales locales:
```
spring.datasource.url=jdbc:mysql://localhost:3306/springedu_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
server.port=8081
```

### 4. Ejecución
Navega a la raíz del proyecto y ejecuta el comando:
```
./mvnw spring-boot:run
```
Luego, accede desde tu navegador a: http://localhost:8081

🔑 Credenciales de acceso (pruebas)
Usuario: admin
Password: admin123

✉️ Contacto
Desarrollado por Juan Villa Crisosto - Proyecto Final Módulo 6 ABP - Bootcamp Full Stack Java
