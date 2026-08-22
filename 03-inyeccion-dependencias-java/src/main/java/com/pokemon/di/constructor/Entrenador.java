package com.pokemon.di.constructor;

class Entrenador {
	private String nombre;
	private Pokemon miPokemon;
	
	//La inyeccion se hace directamente en el constructor
	Entrenador(String nombre, Pokemon miPokemon){
		this.nombre = nombre;
		this.miPokemon = miPokemon;
	}
	
	void mostrarPokemon() {
		System.out.println(nombre + " muestra a su pokemon.");
		miPokemon.atacar();
	}
}