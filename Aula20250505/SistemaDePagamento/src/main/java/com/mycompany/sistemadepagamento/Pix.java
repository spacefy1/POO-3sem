
package com.mycompany.sistemadepagamento;

public class Pix extends MeioPagamento implements IAutorizavel {
    private String cpf;
    private int numeroDeCelular; 
    private boolean aprovadoPix;
    
    //constructor da superclasse identificador
    public Pix(String identificador) {
        super(identificador);
    }

    //constructor dessa classe (Pix)
    public Pix(String cpf, int numeroDeCelular, boolean aprovadoPix, String identificador) {
        super(identificador);
        this.cpf = cpf;
        this.numeroDeCelular = numeroDeCelular;
        this.aprovadoPix = aprovadoPix;
    }

    //metodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(int numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }

    public boolean isAprovadoPix() {
        return aprovadoPix;
    }

    public void setAprovadoPix(boolean aprovadoPix) {
        this.aprovadoPix = aprovadoPix;
    }
    
    //funçoes dessa classe
    @Override
    public void mostrarDetalhes() {
        System.out.println("Pix{" + "cpf=" + cpf + ", numeroDeCelular=" + numeroDeCelular + ", aprovadoPix=" + aprovadoPix + '}');
    }

    @Override
    public void autorizarPagamento() {
        this.setAprovadoPix(true);

    }  
    
}
