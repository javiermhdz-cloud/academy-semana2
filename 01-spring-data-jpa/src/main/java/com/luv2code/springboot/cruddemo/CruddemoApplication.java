package com.luv2code.springboot.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.springboot.cruddemo.dao.PokemonRepository;
import com.luv2code.springboot.cruddemo.entity.Pokemon;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	
	/*
	@Bean
	public CommandLineRunner commandLineRunner(PokemonRepository repository) {
		return runner -> {
			//Create two pokemons
			Pokemon gengar = new Pokemon(94, "Gengar", "Ghost", 44);
			Pokemon totodile = new Pokemon(158, "Totodile", "Water", 30);
			
			//Save them
			repository.save(gengar);
			repository.save(totodile);
			
			System.out.println("Saved pokemon: " + gengar);
			System.out.println("Saved pokemon: " + totodile);
			
			//Fetch data from DataBase
			System.out.println("List of Pokemon in DataBase:");
			repository.findAll().forEach(p -> System.out.println(p));
		};
	}*/
}
