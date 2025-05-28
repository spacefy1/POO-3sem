package com.mycompany.pokemonpoo;

public abstract class Pokemon {
    //professor, decidi fazer tudo em ingles
    //apenas por questao de praticidade 
    private int hp;
    private String name;
    private String type;
    private String weakness;
    private String strength;
    private String resistance;
    private int Atk; 
    private String noise; 

    //metodos getters e setters da classe

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public String getNoise() {
        return noise;
    }

    protected void setNoise(String noise) {
        this.noise = noise;
    }
    
    //metodo constructor da classe
    public Pokemon(int hp, String name, String weakness, String strength, String resistance, int Atk, String noise) {
        this.hp = hp;
        this.name = name;
        this.weakness = weakness;
        this.strength = strength;
        this.resistance = resistance;
        this.Atk = Atk;
        this.noise = noise;
    }
    public void showDetails() {
        System.out.println("Pokemon{" + "hp=" + hp + ", name=" + name + ", type=" + type + ", weakness=" + weakness 
                + ", "+ "strength=" + strength + ", resistance=" + resistance + ", Atk=" + Atk + ", noise=" + noise + '}'); 
    }
}
