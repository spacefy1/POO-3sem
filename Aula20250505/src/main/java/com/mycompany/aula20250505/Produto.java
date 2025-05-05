package com.mycompany.aula20250505;

public class Produto {
    public String nome;
    public double preco;
    
   
    public Produto(String nome, double preco){
        this.nome = nome; 
        this.preco = preco;
        }
    
    public void ehCaro(){
        if(preco > 200){
            System.out.println("Livro é caro");
        } else{
            System.out.println("O livro é barato");
        }
    }

}
