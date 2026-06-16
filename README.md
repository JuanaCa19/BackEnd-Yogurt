# Yogurt App

Aplicación web para la gestión de productos de yogurt y autenticación de usuarios.

## Descripción

Este proyecto está compuesto por un backend desarrollado con Spring Boot y PostgreSQL. Permite administrar productos de yogurt mediante una API REST, incluyendo operaciones de creación, consulta, actualización y eliminación (CRUD).

También cuenta con un módulo básico de usuarios para registro e inicio de sesión.

## Tecnologías utilizadas

### Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Lombok
- BCrypt (encriptación de contraseñas)
- Maven

### Frontend
- HTML5
- CSS3
- JavaScript

## Funcionalidades

### Gestión de Yogurts
- Crear productos
- Consultar todos los productos
- Consultar producto por ID
- Actualizar productos
- Eliminar productos

### Gestión de Usuarios
- Registro de usuarios
- Validación de inicio de sesión
- Contraseñas cifradas con BCrypt

## Base de datos

El proyecto utiliza PostgreSQL.

Configuración actual:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/yogurt_db
spring.datasource.username=postgres
spring.datasource.password=admin
```

## Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/TU-USUARIO/TU-REPOSITORIO.git
```

### 2. Entrar al proyecto

```bash
cd Yogurt2
```

### 3. Configurar PostgreSQL

Crear una base de datos llamada:

```sql
CREATE DATABASE yogurt_db;
```

### 4. Configurar credenciales

Editar el archivo:

```text
src/main/resources/application.properties
```

y colocar tus credenciales de PostgreSQL.

### 5. Ejecutar el proyecto

Con Maven:

```bash
mvn spring-boot:run
```

o desde IntelliJ IDEA.

## Endpoints principales

### Yogurts

| Método | Endpoint | Descripción |
|----------|----------|----------|
| GET | `/api/yogurt/findAll` | Obtener todos los yogurts |
| GET | `/api/yogurt/findById/{id}` | Obtener yogurt por ID |
| POST | `/api/yogurt/save` | Crear yogurt |
| PUT | `/api/yogurt` | Actualizar yogurt |
| DELETE | `/api/yogurt/delete/{id}` | Eliminar yogurt |

### Usuarios

| Método | Endpoint | Descripción |
|----------|----------|----------|
| POST | `/api/user/save` | Registrar usuario |
| POST | `/api/user/validate` | Validar inicio de sesión |

## Modelo Yogurt

```json
{
  "id": 1,
  "nombre": "Yogurt de Fresa",
  "categoria": "Frutal",
  "precio": 2500,
  "imagenUrl": "https://ejemplo.com/imagen.jpg",
  "activo": true,
  "stock": 20
}
```

## Autor

Juan Cárdenas

Proyecto académico desarrollado para practicar:
- Java
- Spring Boot
- APIs REST
- PostgreSQL
- Desarrollo Web
