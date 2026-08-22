package com.pokemon.di.constructor;

class Inyector {
	static Entrenador constructorEntrenador(String nombre) {	
		//inyeccion con el constructor
		return new Entrenador(nombre, new Gengar());
	}
}
