package com.pokemon.di.variable;

class Main {

	public static void main(String[] args) {
		Entrenador miEntrenador = new Entrenador("Gary Oak del Pueblo Paleta");
		
		//inyectar la dependencia del pokemon
		Inyector.inyectarPokemon(miEntrenador);
		miEntrenador.mostrarPokemon();
	}

}
