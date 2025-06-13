/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exericiopooconta;

/**
 *
 * @author guilh
 */
public class Conta {
    private double saldo; 

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double dinheiro){
        if(dinheiro > 0 && this.getSaldo() >= dinheiro){
            this.setSaldo(this.getSaldo() - dinheiro);
            System.out.println("Saque de " + dinheiro + ". Agora a conta esta com: " + this.getSaldo());
        } else if (dinheiro <= 0) {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + String.format("%.2f", dinheiro) + ". Saldo atual: R$" + String.format("%.2f", this.saldo));
        }
    }
    
    public void depositar(double dinheiro){
        if(dinheiro > 0 && dinheiro >= this.saldo){
            this.setSaldo(this.getSaldo() + dinheiro);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }
    
    public void exibirInfo(){
        System.out.println("Conta: " + this.getSaldo());
    }
}
