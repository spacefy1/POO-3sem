/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula20250505;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab02
 */
public class Aula20250505 {

    public static void main(String[] args) {
        Produto p1 = new Produto ("Produto generico", 150.9);
        p1.ehCaro();
        
        Livro l1 = new Livro("Pablo M.", 50, "Cafe com Deus Pai", 400.8);
        l1.ehGrande();
        
        Eletronico e1 = new Eletronico(12, "Computador", 1034.12);
        
        List<Produto> listaGenerica = new ArrayList<>();
       
        listaGenerica.add(l1);
        listaGenerica.add(e1);
        
        for(Produto p : listaGenerica){
            System.out.println(p.nome);
            p.ehCaro();
            //fazer esse metodo abaixo funcionar
            p.ehGrande();
        }
    }
}
