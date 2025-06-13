package com.mycompany.list;

public class InfluenciadorBom extends Influenciador implements IPodeFazerDancinhaTikTok{
    private int caridadesFeitas;

    public InfluenciadorBom(String nome, int numeroSeguidores) {
        super(nome, numeroSeguidores);
        this.caridadesFeitas = 0;
    }
    
    public void fazerCaridade(){
        this.setCaridadesFeitas(this.getCaridadesFeitas() + 1);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("---- INFLUENCIADOR BOM ----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Numero de seguidores: " + this.getNumeroSeguidores());
        System.out.println("Caridades feitas: " + this.getCaridadesFeitas());
        
    }

    @Override
    public void fazerDancinhaTikTok() {
        System.out.println(nome + " está fazendo uma dancinha viral no TikTok! \n");
    }

    public int getCaridadesFeitas() {
        return caridadesFeitas;
    }

    public void setCaridadesFeitas(int caridadesFeitas) {
        this.caridadesFeitas = caridadesFeitas;
    }
    

}
    
    

