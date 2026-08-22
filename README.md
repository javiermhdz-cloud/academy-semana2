# Programa 1: Spring Boot REST API con Spring Data JPA

API REST desarrollada con Spring Boot y Spring Data JPA para la gestión de un catálogo de Pokémon. La cual se encuentra conectada a una base de datos MySQL en Docker.

---

## 1. Entidad Elegida
**Entidad:** `Pokemon` (Mapeada a la tabla `pokemon`).

| Campo | Tipo | Descripción |
| :--- | :--- | :--- |
| `id` | `int` | Llave primaria (Auto-incrementable). |
| `pokedexNumber` | `int` | Número oficial en la Pokédex. |
| `name` | `String` | Nombre del Pokémon. |
| `type` | `String` | Tipo(s) elemental(es). |
| `level` | `int` | Nivel actual del Pokémon. |

---

## 2. Instrucciones para Levantar el Proyecto

### Base de Datos (MySQL en Docker)
1. Iniciar el contenedor de MySQL en Docker Desktop (Puerto por defecto `3306`).
2. Crear la base de datos y la estructura ejecutando el script `src/main/resources/pokemon-directory.sql`:

```sql
CREATE DATABASE IF NOT EXISTS `pokemon_db`;
USE `pokemon_db`;

CREATE TABLE IF NOT EXISTS `pokemon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pokedex_number` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `level` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

```

### Ejecución de la Aplicación

* **Puerto del servidor:** `8070`
* **Clase Principal:** Ejecutar `CruddemoApplication.java` como *Spring Boot App*.

---

## 3. Endpoints REST

| Verbo HTTP | Endpoint | Descripción | Body (JSON Ejemplo) |
| --- | --- | --- | --- |
| **GET** | `/api/pokemons` | Obtiene la lista completa de Pokémon. | N/A |
| **GET** | `/api/pokemons/{id}` | Obtiene un Pokémon por su ID. | N/A |
| **POST** | `/api/pokemons` | Crea un nuevo Pokémon. | `{"pokedexNumber": 150, "name": "Mewtwo", "type": "Psychic", "level": 70}` |
| **PUT** | `/api/pokemons` | Actualiza un Pokémon existente. | `{"id": 1, "pokedexNumber": 25, "name": "Pikachu", "type": "Electric", "level": 100}` |
| **PATCH** | `/api/pokemons/{id}` | Actualización parcial de un Pokémon. | `{"level": 90}` |
| **DELETE** | `/api/pokemons/{id}` | Elimina un Pokémon por su ID. | N/A |

# Programa 2: Spring Boot REST API con Spring Data MongoDB

Proyecto backend desarrollado con Spring Boot y Spring Data MongoDB que expone una interfaz RESTful para la gestión de entidades Pokemon.

---

## 1. Entidad Elegida y Estructura de Datos

Se implementó la entidad **`Pokemon`** mapeada a la colección `pokemons` en MongoDB.

* **`id`** (`String`): Identificador único generado automáticamente por MongoDB (`ObjectId`).
* **`pokedexNumber`** (`int`): Número de registro en la Pokédex.
* **`name`** (`String`): Nombre del Pokémon.
* **`type`** (`String`): Tipo elemental (ej. Fire, Water, Electric).
* **`level`** (`int`): Nivel del Pokémon.

---

## 2. Instrucciones de Despliegue

### Requisitos previos
* Docker Desktop activo.
* Java 17+ y Eclipse / IntelliJ IDE.

### Pasos para levantar la infraestructura y la base de datos
1. **Contenedor de MongoDB y Mongo Express:**
   Asegurarse de tener corriendo los contenedores en Docker:
   * **MongoDB:** Escuchando en el puerto `27017`.
   * **Mongo Express:** Escuchando en el puerto `8082` (`http://localhost:8082`).

2. **Base de Datos y Carga Inicial:**
   La base de datos utilizada es **`pokemon_db`**. Se crea automáticamente al insertar el primer documento o mediante el script incluido:
   ```bash
   docker exec -i mongo-8 mongosh < src/main/resources/init-db.js



3. **Ejecutar la Aplicación Backend:**
* Abrir el proyecto en el IDE y ejecutar `CruddemoApplication.java`.
* La API REST quedará disponible en la ruta base http://localhost:8081/api/pokemons.



---

## 3. Endpoints de la API REST

| Método | Endpoint | Descripción | Ejemplo de Body (JSON) |
| --- | --- | --- | --- |
| **GET** | `/api/pokemons` | Obtiene la lista completa de Pokémon. | N/A |
| **GET** | `/api/pokemons/{id}` | Obtiene un Pokémon por su ID de MongoDB. | N/A |
| **POST** | `/api/pokemons` | Registra un nuevo Pokémon. | `{"pokedexNumber": 4, "name": "Charmander", "type": "Fire", "level": 12}` |
| **PUT** | `/api/pokemons/{id}` | Actualiza un Pokémon existente por completo. | `{"pokedexNumber": 4, "name": "Charmander", "type": "Fire", "level": 16}` |
| **PATCH** | `/api/pokemons/{id}` | Actualiza parcialmente un campo (ej. nivel). | `{"level": 16}` |
| **DELETE** | `/api/pokemons/{id}` | Elimina un Pokémon por su ID. | N/A |
