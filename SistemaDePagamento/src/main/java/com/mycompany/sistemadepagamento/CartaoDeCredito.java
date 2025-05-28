package com.mycompany.sistemadepagamento;

public class CartaoDeCredito extends MeioPagamento implements IAutorizavel  {

    private int numCartao;
    private String validade;
    private int cvv;
    private boolean aprovado;
    
    //constructor da superclasse identificador
    public CartaoDeCredito(String identificador) {
        super(identificador);
    }

    //constructor dessa classe (CartaoDeCredito) 
    public CartaoDeCredito(int numCartao, String validade, int cvv, String identificador) {
        super(identificador);
        this.numCartao = numCartao;
        this.validade = validade;
        this.cvv = cvv;
        this.aprovado = false;
    }

    //metodos getters e setters
    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //metodos da classe
    @Override
    public void autorizarPagamento() {
        this.setAprovado(true); 
    }

    @Override 
    public void mostrarDetalhes() {
        System.out.println("CartaoDeCredito{" + "numCartao=" + numCartao + ", validade=" + validade + ", cvv=" + cvv + '}');
    }

    
    
}
