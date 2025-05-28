
package com.mycompany.sistemadepagamento;

public abstract class MeioPagamento {
    private String identificador;

    public MeioPagamento(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public abstract void mostrarDetalhes(); 
}
