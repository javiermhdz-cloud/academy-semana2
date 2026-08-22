package com.pokemon.di.setter;

class Main {

	public static void main(String[] args) {
		Entrenador miEntrenador = new Entrenador("Ash Ketchum del Pueblo Paleta");
		
		//inyectar la dependencia del pokemon
		Inyector.inyectarPokemon(miEntrenador);
		miEntrenador.mostrarPokemon();
	}

}
