package com.luv2code.springboot.cruddemo;

import com.luv2code.springboot.cruddemo.entity.Pokemon;
import com.luv2code.springboot.cruddemo.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	/*
	@Bean
	public CommandLineRunner commandLineRunner(PokemonRepository repository) {
		return runner -> {
			// 1. Create an object
			Pokemon pikachu = new Pokemon(25, "Pikachu", "Electric", 50);
			Pokemon bulbasaur = new Pokemon(1, "Bulbasaur", "Grass", 15);
			
			// 2. Save it in MongoDB
			Pokemon savedPokemon = repository.save(pikachu);
			Pokemon savedPokemon2 = repository.save(bulbasaur);
			System.out.println("MongoDB: " + savedPokemon);
			System.out.println("MongoDB: " + savedPokemon2);
			
			// 3. Check all the values
			System.out.println("Pokemon list in the DataBase:");
			repository.findAll().forEach(p -> System.out.println(p));
		};
	}*/
}
