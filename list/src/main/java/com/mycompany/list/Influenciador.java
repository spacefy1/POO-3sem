
package com.mycompany.list;

abstract class Influenciador { // Tornada abstrata pois talvez exibirInformacoes possa ser genérico
    protected String nome;
    protected int numeroSeguidores;

    public Influenciador(String nome, int numeroSeguidores) {
        this.nome = nome;
        this.numeroSeguidores = numeroSeguidores;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }
    
    public abstract void exibirInformacoes();
}