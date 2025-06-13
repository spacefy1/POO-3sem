package com.mycompany.ex1;

public class Coach extends Members implements Manager{

    public Coach(String nome, String cpf) {
        super(nome, cpf);
    }

    //Metodos da superclasse Members
    @Override
    public void jogar() {
        System.out.println(this.getNome() + " esta aposentado");
    }

    //metodos da interface Manager
    @Override
    public void organizarTime() {
        System.out.println("Tecnico organizou o time ");
    }

    @Override
    public void treinar() {
        System.out.println("Tecnico esta treinando o time \n");
    }
    
    
}
