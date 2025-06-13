
package com.mycompany.ex1;

public class Player extends Members {

    public Player(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void jogar() {
        System.out.println(this.getNome() + " esta jogando \n");
    }
    
}
