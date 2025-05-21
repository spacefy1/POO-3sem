
package com.mycompany.sistemadepagamento;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome; 
    private String cpf; 
    private int idade; 
    private List<MeioPagamento> transacoes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public List<MeioPagamento> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<MeioPagamento> transacoes) {
        this.transacoes = transacoes;
    }

    
    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public void adicionarMeio(MeioPagamento meios){
        transacoes.add(meios); 
    }
    
    //for-each que percorre a lista <MeioPagamento> 
    //daria para usar outros, mas deu erro :_> 
    public void mostrarPagamentos(){
        for (MeioPagamento i : transacoes){ 
            System.out.println(i);
        }
    }
}
