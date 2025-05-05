/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula20250505;

/**
 *
 * @author alunolab02
 */
public class Livro extends Produto {
    public String autor;
    public int paginas;

    public Livro(String autor, int paginas, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
        System.out.println("Construtor de livro");
    }
    

    public void ehGrande(){
        if(paginas > 200){
            System.out.println("O livro é grande");
        }else{
            System.out.println("O livro é pequeno");
        }
    }
    
    public void ehGrande(boolean ehInfantil){
        if(paginas > 13){
            System.out.println("O Livro infantil é grande");
        } else {
            System.out.println("O Livro infantil é pequeno");
        }
    }
}
