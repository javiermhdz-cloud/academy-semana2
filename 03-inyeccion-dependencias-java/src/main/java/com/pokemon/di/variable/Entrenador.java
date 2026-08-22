package com.pokemon.di.variable;

class Entrenador {
	private String nombre;
	//Inyeccion por variable de referencia
	Pokemon miPokemon;
	
	Entrenador(String nombre){
		this.nombre = nombre;
	}
	
	void mostrarPokemon() {
		System.out.println(nombre + " muestra a su pokemon.");
		miPokemon.atacar();
	}
}