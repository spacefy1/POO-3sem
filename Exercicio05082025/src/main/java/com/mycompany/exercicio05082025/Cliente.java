package com.mycompany.exercicio05082025;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int cpf;
    private ArrayList<Conta> conta;

    public Cliente(String nome, int cpf, double saldoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta(saldoConta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Cliente(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
    
    public void mostrarSaldos(){
        System.out.println("Seu saldo é: " + this.getConta());
    }
}
