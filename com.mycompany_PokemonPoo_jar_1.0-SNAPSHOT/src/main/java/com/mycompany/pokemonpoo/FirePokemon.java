
package com.mycompany.pokemonpoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilh
 */
public class FirePokemon extends Pokemon implements IPokemon {
    
    //atributos
    private final List<Pokemon> pokemons = new ArrayList<>();

    //constructor da superclasse pokemon
    public FirePokemon(int hp, String name, String weakness, String strength, String resistance, int Atk, String noise) {
        super(hp, name, weakness, strength, resistance, Atk, noise);
        this.setType("fire");
    }

    //metodos da interface IPokemon
    @Override
    public void attack() {
        System.out.println(this.getName() + " has attacked!!");
    }

    @Override
    public void pokemonNoise() {
        System.out.println(this.getNoise());
    }

    @Override
    public void showDetails() {
        System.out.println("Pokemon{" + "hp=" + this.getHp() + ", name=" + 
                            this.getName() + ", type=" + this.getType() + ", weakness=" + this.getWeakness() +
                            "strength=" + this.getStrength() + ", resistance=" + this.getResistance() + ", Atk=" + this.getAtk() 
                            + ", noise=" + this.getNoise() + '}');

    }
}   
