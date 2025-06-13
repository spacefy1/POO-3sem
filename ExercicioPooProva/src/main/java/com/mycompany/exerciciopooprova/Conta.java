package com.mycompany.exerciciopooprova;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private double saldo;
    private List<Cliente> clientes;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.clientes = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void addCliente(String nome, String cpf, String endereço){
        this.clientes.add(new Cliente(nome, cpf, endereço));
    }
    
    public void deletar(){
        this.clientes.clear();
    }
    
    public void sacar(double din){
        if(this.getSaldo() >= din && din >= 0){
            this.setSaldo(this.getSaldo() - din);
            System.out.println("O dinheiro que foi sacado é " + din + ". O valor da conta agora é: " + this.getSaldo());
        }
    }
    
    public void deposito(double din){
        if(din >= 0){
            this.setSaldo(this.getSaldo() + din);
            System.out.println("O dinheiro que foi depositado é: " + din + ". A conta agora esta com R$ " + this.getSaldo());
        }
    }
    
    public void mostrarTudo(){
        for(Cliente c : clientes){
            c.mostrarInfos();
        }
    }
}

