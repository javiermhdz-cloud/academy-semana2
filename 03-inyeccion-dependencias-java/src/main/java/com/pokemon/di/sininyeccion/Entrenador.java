package com.pokemon.di.sininyeccion;

class Entrenador {
	private String nombre;
	//Alto Acoplamiento porque depende de las clases
	private Blastoise miPokemon;
	
	Entrenador(String nombre){
		this.nombre = nombre;
		//El objeto Blastoise depende de la clase Entrenador
		this.miPokemon = new Blastoise();
	}
	
	void mostrarPokemon() {
		System.out.println(nombre + " muestra a su pokemon.");
		miPokemon.atacar();
	}
}
