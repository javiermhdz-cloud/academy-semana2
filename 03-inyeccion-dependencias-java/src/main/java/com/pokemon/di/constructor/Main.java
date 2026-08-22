package com.pokemon.di.constructor;

class Main {

	public static void main(String[] args) {
		Entrenador miEntrenador = Inyector.constructorEntrenador("Red");
		miEntrenador.mostrarPokemon();
	}

}
