package com.mycompany.exercicio05082025;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public double saque(){
        System.out.println("Seu saldo é: " + this.getSaldo());
        return this.getSaldo();
    }
    
    public void deposito(){
        this.setSaldo(saldo - this.getSaldo());
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void aplicarRendimento(){
            
    }
}
