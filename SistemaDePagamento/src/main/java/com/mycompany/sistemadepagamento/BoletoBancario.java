
package com.mycompany.sistemadepagamento;

public class BoletoBancario extends MeioPagamento {
    private String codigoBarras;
    
    public BoletoBancario(String identificador) {
        super(identificador);
    }

    public BoletoBancario(String codigoBarras, String identificador) {
        super(identificador);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setNumBoleto(String numBoleto) {
        this.codigoBarras = numBoleto;
    }
    
    

    @Override
    public void mostrarDetalhes() {
        System.out.println("BoletoBancario{" + "numBoleto=" + codigoBarras + '}');
    }
    
}
