
package com.mycompany.pokemonpoo;

import java.util.ArrayList;
import java.util.List;


public class PokemonPoo {

    public static void main(String[] args) {
     
        List<WaterPokemon> nomes = new ArrayList<>(); 
        List<FirePokemon> fire = new ArrayList<>();
        
        
        nomes.add(new WaterPokemon(60, "Oshawott", "Grass", "Fire", "Fire", 54, "Osha- Oshawott"));
        nomes.add(new WaterPokemon(100, "Dewott", "Grass", "Fire", "Fire", 94, "De- Dewott"));
        nomes.add(new WaterPokemon(167, "Samurott Hisui", "Grass", "Fire", "Fire", 134, "Sam- Samurott"));
        
        //criaçao de pokemons tipo fogo 
        fire.add(new FirePokemon(60,"Torchic", "Water", "Grass", "Grass", 60, "Tor- Torchic" ));
        fire.add(new FirePokemon(93, "Combusten", "Water", "Grass", "Grass", 100, "Com- Combusten" ));
        fire.add(new FirePokemon(160, "Blaziken", "Water", "Grass", "Grass and Psychic", 100, "Com- Combusten" ));

        
        /*for(int e = 0; e <= nomes.size(); e++){
          //  System.out.println(nomes.get(e));
        }
    
        for(Pokemon e : nomes){
            System.out.println(e);
        }*/
        
        for(WaterPokemon e : nomes){
            e.showDetails();
            e.pokemonNoise();
            e.attack();
        }
        
        //para mostrar a lista da subclasse FirePokemon
        for(FirePokemon a : fire){
            a.showDetails();
            a.pokemonNoise();
            a.attack();
        }
    }
}
