package com.mycompany.exerciciopooprovaagregacao;

public class ExercicioPooProvaAgregacao {

    public static void main(String[] args) {
        Conta c1 = new Conta(1544.2);
        Conta c2 = new Conta(5434.2);
            
        Cliente bs = new Cliente("Altoe", "453.264.630-02", "Rua 1");
        Cliente bs1 = new Cliente("Gui", "465.364.780-45", "Rua 2");
        
        c1.addCliente(bs);
        c1.addCliente(bs1);
        
        c1.sacar(56.2);
        c1.deposito(100.2);
        
        c1.mostrarTudo();
        c2.mostrarTudo();
    }
}
