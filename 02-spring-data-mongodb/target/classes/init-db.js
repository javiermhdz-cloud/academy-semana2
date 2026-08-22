use pokemon_db;

db.pokemons.drop();

db.pokemons.insertMany([
  {
    "pokedexNumber": 1,
    "name": "Bulbasaur",
    "type": "Grass",
    "level": 15,
    "_class": "com.luv2code.springboot.cruddemo.entity.Pokemon"
  },
  {
    "pokedexNumber": 4,
    "name": "Charmander",
    "type": "Fire",
    "level": 12,
    "_class": "com.luv2code.springboot.cruddemo.entity.Pokemon"
  },
  {
    "pokedexNumber": 25,
    "name": "Pikachu",
    "type": "Electric",
    "level": 50,
    "_class": "com.luv2code.springboot.cruddemo.entity.Pokemon"
  }
]);