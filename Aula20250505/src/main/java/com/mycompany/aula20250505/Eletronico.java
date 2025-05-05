/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula20250505;

public class Eletronico extends Produto {
    public int voltagem;

    public Eletronico(int voltagem, String nome, double preco) {
        super(nome, preco);
        this.voltagem = voltagem;
    }
    
    @Override
    public void ehCaro(){
        if(preco > 1000){
            System.out.println("O eletronico é caro");
        }else{
            System.out.println("O eletronico é barato");
        }
    }
}
