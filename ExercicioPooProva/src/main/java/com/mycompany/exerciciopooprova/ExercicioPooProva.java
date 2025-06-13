package com.mycompany.exerciciopooprova;

public class ExercicioPooProva {

    public static void main(String[] args) {
        Conta c1 = new Conta(10000.0);
        
        c1.addCliente("Gui", "384.356.463-92", "Rua Legal");
        c1.addCliente("Altoe", "453.215.138-98", "Rua 1");
        
        c1.sacar(367.23);
        
        c1.deposito(345.12);
        
        c1.mostrarTudo();
        
        c1.getClientes().get(0).mostrarSaldo();
        c1.getClientes().get(1).mostrarSaldo();
    }
}
