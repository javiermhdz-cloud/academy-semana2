# academy-semana2

# Programa 1: Spring Boot REST API con Spring Data JPA

API REST desarrollada con Spring Boot 3 y Spring Data JPA para la gestión de un catálogo de Pokémon, conectada a una base de datos MySQL en Docker.

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


Ejecución de la AplicaciónPuerto del servidor: 8070Clase Principal: Ejecutar CruddemoApplication.java como Spring Boot App.3. Endpoints RESTVerbo HTTPEndpointDescripciónBody (JSON Ejemplo)GET/api/pokemonsObtiene la lista completa de Pokémon.N/AGET/api/pokemons/{id}Obtiene un Pokémon por su ID.N/APOST/api/pokemonsCrea un nuevo Pokémon.{"pokedexNumber": 150, "name": "Mewtwo", "type": "Psychic", "level": 70}PUT/api/pokemonsActualiza un Pokémon existente.{"id": 1, "pokedexNumber": 25, "name": "Pikachu", "type": "Electric", "level": 100}PATCH/api/pokemons/{id}Actualización parcial de un Pokémon.{"level": 90}DELETE/api/pokemons/{id}Elimina un Pokémon por su ID.N/A
