package com.pokemon.di.setter;

class Entrenador {
	private String nombre;
	//Encapsulado como privado
	private Pokemon miPokemon;
	
	Entrenador(String nombre){
		this.nombre = nombre;
	}
	
	//metodo setter necesario para
	//hacer la inyeccion de dependencias
	void setPokemon(Pokemon pokemon) {
		this.miPokemon = pokemon;
	}
	
	void mostrarPokemon() {
		System.out.println(nombre + " muestra a su pokemon.");
		miPokemon.atacar();
	}
}
