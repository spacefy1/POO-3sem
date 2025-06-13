package com.mycompany.exerciciopooprova;

public class Cliente {
    private String nome; 
    private String cpf;
    private String endereço;
    private Conta conta;

    public Cliente(String nome, String cpf, String endereço) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
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
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public void mostrarInfos(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereço());
    }
    
    public void mostrarSaldo() {
        // Verifica se a conta não é nula antes de tentar acessar o saldo
        if (this.conta != null) {
            System.out.println("Saldo da Conta: R$ " + this.conta.getSaldo());
        } else {
            System.out.println("Nenhuma conta associada a este cliente.");
        }
    }
}
