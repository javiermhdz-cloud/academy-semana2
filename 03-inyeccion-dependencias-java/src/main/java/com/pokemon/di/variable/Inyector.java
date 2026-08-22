package com.pokemon.di.variable;

class Inyector {
	static void inyectarPokemon(Entrenador entrenador) {
		//asignacion a variable de referencia
		entrenador.miPokemon = new Ditto();
	}
}
