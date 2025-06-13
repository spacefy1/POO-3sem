package com.mycompany.exericiopooconta;

public class ExericioPooConta {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gui", "387.344.435-02"); 
        Cliente c2 = new Cliente("Altoe", "485.456.341-54");
        Cliente c3 = new Cliente("Tomas", "698.456.135-42"); 
        
        c1.adicionarConta(45.4);
        c2.adicionarConta(45.2);
        
        c1.getContas().get(0).sacar(30.43);
        c1.getContas().get(0).depositar(42.2);
        
        c2.getContas().get(0).sacar(30.12);
        c2.getContas().get(0).depositar(20.2);
        
        c1.mostrarSaldo();
        c2.mostrarSaldo();
        c3.mostrarSaldo();
    }
}
