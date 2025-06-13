package com.mycompany.list;

public class List {

    public static void main(String[] args) {
        Agencia a1 = new Agencia("ADR");
        Agencia a2 = new Agencia("Youtubers Mansion"); 
        
        a1.adicionarInfluenciadorBom("Cereaw", 54954);
        a1.adicionarInfluenciadorBom("Eskimo", 345484);
        a1.adicionarInfluenciadorQuestionavel("Lil ze", 5412519);
        a1.adicionarInfluenciadorQuestionavel("Virginia", 90048567);
        
        
        a2.adicionarInfluenciadorBom("JazzGhost", 435845);
        a2.adicionarInfluenciadorBom("Kranio", 879990);
        a2.adicionarInfluenciadorQuestionavel("Rezend", 458953);
        a2.adicionarInfluenciadorQuestionavel("Wilker Leao", -4356);
        
        a1.listarInfluenciadores();
        a2.listarInfluenciadores();
        
        a1.realizarAcoesEspecificas();
        a2.realizarAcoesEspecificas();
        
        
    }
}
