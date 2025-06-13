package com.mycompany.exericiopooconta;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome; 
    private String cpf; 
    private List<Conta> contas; 

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>(); 
    }

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
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
    public void adicionarConta(double saldo){
        if(contas != null){    
            contas.add(new Conta(saldo));
            System.out.println("Conta adicionada");
        }
    }
    
    public void mostrarSaldo(){
        if(contas.isEmpty()){
            System.out.println("Nao ha contas disponiveis ");
        }
        
        for(Conta e : contas){
            System.out.println("As contas sao: " + e.getSaldo());
        }
    }
    
    public void deletarConta(){
        this.contas.clear();
    }
}
