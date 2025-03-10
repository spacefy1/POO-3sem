
package com.mycompany.poo0310;

public class POO0310 {

    public static void main(String[] args) {
        
        
        System.out.println("TESTE");
        
        teste t1 = new teste(10, 20, 30);
        teste t2 = new teste(10, 20, 30);
        teste t3 = new teste(10, 20, 30);
        
        System.out.println(teste.getQuantidade());
        teste.quantidade = 10;
        
    }
}
