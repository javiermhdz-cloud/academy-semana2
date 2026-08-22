package com.luv2code.springboot.cruddemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemons")
public class Pokemon {

    // define fields
    //
    // El id es String, no int: MongoDB genera un ObjectId (hexadecimal de 24
    // caracteres). No lleva @GeneratedValue — el driver lo asigna al insertar.
    @Id
    private String id;

    // Sin @Column: MongoDB no tiene esquema, así que el campo del documento se
    // llama igual que la propiedad Java. No hay nada que mapear.
    private int pokedexNumber;

    private String name;

    private String type;
    
    private int level;


    // define constructors
    public Pokemon() {

    }

    public Pokemon(int pokedexNumber, String name, String type, int level) {
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.type = type;
        this.level = level;
    }

    // define getter/setter
    
    public String getId() {
    	return id;
    }
    
    public void setId(String id) {
    	this.id = id;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(int pokedexNumber) {
    	this.pokedexNumber = pokedexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // define toString
    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", pokedexNumber=" + pokedexNumber +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                '}';
    }
}
