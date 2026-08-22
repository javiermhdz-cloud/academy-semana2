package com.pokemon.di.setter;

class Inyector {
	static void inyectarPokemon(Entrenador entrenador) {
		//asignacion a variable de referencia
		entrenador.setPokemon(new Machop());
	}
}
