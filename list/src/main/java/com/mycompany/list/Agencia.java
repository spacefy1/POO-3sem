package com.mycompany.list;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nomeAgencia;
    // Lista polimórfica para armazenar qualquer tipo de Influenciador
    private List<Influenciador> influenciadores;
    
    public Agencia(String nomeAgencia){
        this.nomeAgencia = nomeAgencia;
        this.influenciadores = new ArrayList<>(); 
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
    
    //metodos para adicionar influenciador bom e questionavel na lista influenciadores
    public void adicionarInfluenciadorBom(String nome, int numeroSeguidores) {
        this.influenciadores.add(new InfluenciadorBom(nome, numeroSeguidores));
    }

    public void adicionarInfluenciadorQuestionavel(String nome, int numeroSeguidores) {
        this.influenciadores.add(new InfluenciadorQuestionavel(nome, numeroSeguidores));
    }

    public List<Influenciador> getInfluenciadores() {
        return influenciadores;
    }

    public void setInfluenciadores(List<Influenciador> influenciadores) {
        this.influenciadores = influenciadores;
    }

    public void listarInfluenciadores(){
        System.out.println("Influenciador bom adicionado a lista influenciadores da classe Agencia");
        if(influenciadores.isEmpty()){
            System.out.println("Nao há influenciadores na lista!!");
        }else{
            for(Influenciador e : influenciadores){
                System.out.println("Aqui estão os influenciadores da agencia: " + this.getNomeAgencia());
                e.exibirInformacoes();
            }
        }
    }
    
    public void realizarAcoesEspecificas() {
        System.out.println("\n--- Realizando Ações Específicas ---");
        for (Influenciador inf : influenciadores) {
            if (inf instanceof InfluenciadorBom) {
                ((InfluenciadorBom) inf).fazerDancinhaTikTok();
            }
            if (inf instanceof InfluenciadorQuestionavel) {
                ((InfluenciadorQuestionavel) inf).jogarTigrinho();
            }
            // Ações específicas das subclasses
            if (inf instanceof InfluenciadorBom) {
                ((InfluenciadorBom) inf).fazerCaridade();
            } else if (inf instanceof InfluenciadorQuestionavel) {
                ((InfluenciadorQuestionavel) inf).envolverEmPolemica();
            }
        }
    }
}
