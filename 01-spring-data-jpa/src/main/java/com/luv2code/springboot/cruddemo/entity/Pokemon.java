package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="pokedex_number")
    private int pokedexNumber;
    
    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="level")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
                "id=" + id +
                ", pokedexNumber=" + pokedexNumber +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                '}';
    }
}








