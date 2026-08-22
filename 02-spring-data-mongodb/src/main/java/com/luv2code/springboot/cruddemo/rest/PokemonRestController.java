package com.luv2code.springboot.cruddemo.rest;

import tools.jackson.databind.json.JsonMapper;
import com.luv2code.springboot.cruddemo.entity.Pokemon;
import com.luv2code.springboot.cruddemo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PokemonRestController {

    private PokemonService pokemonService;

    private JsonMapper jsonMapper;

    @Autowired
    public PokemonRestController(PokemonService thePokemonService, JsonMapper theJsonMapper) {
        pokemonService = thePokemonService;
        jsonMapper = theJsonMapper;
    }

    // expose "/pokemons" and return a list of pokemons
    @GetMapping("/pokemons")
    public List<Pokemon> findAll() {
        return pokemonService.findAll();
    }

    // add mapping for GET /pokemons/{pokemonId}
    //
    // El pokemonId ahora es String: un ObjectId de MongoDB, no un entero.

    @GetMapping("/pokemons/{pokemonId}")
    public Pokemon getPokemon(@PathVariable String pokemonId) {

        Pokemon thePokemon = pokemonService.findById(pokemonId);

        if (thePokemon == null) {
            throw new RuntimeException("Pokemon id not found - " + pokemonId);
        }

        return thePokemon;
    }

    // add mapping for POST /pokemons - add new pokemon

    @PostMapping("/pokemons")
    public Pokemon addPokemon(@RequestBody Pokemon thePokemon) {

        // also just in case they pass an id in JSON ... set id to null
        // this is to force a save of new item ... instead of update
        //
        // En JPA esto era setId(0). En MongoDB el equivalente es null: si el id
        // viene nulo se inserta un documento nuevo, y si viene con valor se
        // REEMPLAZA el documento que ya existía con ese id.

        thePokemon.setId(null);

        Pokemon dbPokemon = pokemonService.save(thePokemon);

        return dbPokemon;
    }

    // add mapping for PUT /pokemons - update existing pokemon

    @PutMapping("/pokemons")
    public Pokemon updatePokemon(@RequestBody Pokemon thePokemon) {

        Pokemon dbPokemon = pokemonService.save(thePokemon);

        return dbPokemon;
    }

    // add mapping for PATCH /pokemons/{pokemonId} - patch pokemon ... partial
    // update

    @PatchMapping("/pokemons/{pokemonId}")
    public Pokemon patchPokemon(@PathVariable String pokemonId,
            @RequestBody Map<String, Object> patchPayload) {

        // Step 1: Retrieve the existing pokemon from database
        Pokemon tempPokemon = pokemonService.findById(pokemonId);

        if (tempPokemon == null) {
            throw new RuntimeException("Pokemon id not found - " + pokemonId);
        }

        // Step 2: Security check - prevent ID modifications
        // The ID should never change, so reject any attempts to modify it
        if (patchPayload.containsKey("id")) {
            throw new RuntimeException(
                    "Pokemon id cannot be modified. Remove 'id' from request body.");
        }

        // Step 3: Apply the partial update
        // This creates a NEW employee object with the updates applied
        Pokemon patchedPokemon = jsonMapper.updateValue(tempPokemon, patchPayload);

        // Step 4: Save the updated employee to database and return it
        Pokemon dbPokemon = pokemonService.save(patchedPokemon);

        return dbPokemon;
    }

    // add mapping for DELETE /pokemons/{pokemonId} - delete pokemon

    @DeleteMapping("/pokemons/{pokemonId}")
    public String deletePokemon(@PathVariable String pokemonId) {

        Pokemon tempPokemon = pokemonService.findById(pokemonId);

        // throw exception if null

        if (tempPokemon == null) {
            throw new RuntimeException("Pokemon id not found - " + pokemonId);
        }

        pokemonService.deleteById(pokemonId);

        return "Deleted pokemon id - " + pokemonId;
    }

}
