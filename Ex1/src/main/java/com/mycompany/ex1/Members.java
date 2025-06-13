package com.mycompany.ex1;

public abstract class Members {
    private String nome;
    private String cpf;
    
    public void validarCpf(){
        System.out.println("Cpf Validado");  
    }
    
    public abstract void jogar();

    public Members(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void exibirInformaçoes(){
        System.out.println("Nome: " + this.getNome() + ", CPF: " + this.getCpf());
    }
    
    
}
