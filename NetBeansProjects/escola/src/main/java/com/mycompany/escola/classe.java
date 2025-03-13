package com.mycompany.escola;

import java.util.Random;



public class classe{

    Random matricula = new Random();
    int ano;
    String curso;
    String nome;
    String resultado = nome.substring(0, 1).toUpperCase() + nome.substring(1);
    char turma;
    int periodo;
    double nota1;
    double nota2; 
    double notaf;
    static int alunos = 30; 
    
    void Imprimr(){
        System.out.println(ano + " " + matricula);
        System.out.println("Nome: " +resultado);
        System.out.println("Curso: " +curso);
        System.out.println("Turma: " +turma);
        System.out.println("Periodo: " +periodo);
        System.out.println("Nota 1B: " +nota1);
        System.out.println("Nota 2B: " +nota2);
        System.out.println("Nota Final: " +notaf);
        System.out.println("Alunos: " +alunos);
        
    }
    
}
