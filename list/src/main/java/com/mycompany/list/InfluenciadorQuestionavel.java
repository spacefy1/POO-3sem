
package com.mycompany.list;

public class InfluenciadorQuestionavel extends Influenciador implements IPodeJogarTigrinho {
    
    public InfluenciadorQuestionavel(String nome, int numeroSeguidores) {
        super(nome, numeroSeguidores);
    }    
        
    public void envolverEmPolemica(){
        System.out.println(this.getNome() + " é envolvido em polemica!");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---- INFLUENCIADOR QUESTIONAVEL ----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Numero de seguidores: " + this.getNumeroSeguidores());
    }

    @Override
    public void jogarTigrinho() {
        System.out.println(this.getNome() + " está jogando no tigrinho \n");
    }
    
}
