package com.mycompany.ex1;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName; 
    List<Members> players;
    private Coach coach;
    
    public Team(String teamName, Coach coach) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = new ArrayList<>();
        this.players.add(coach);
    }
    
    public void addPlayer(String nome, String cpf){
        players.add(new Player(nome, cpf));
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Members> getPlayers() {
        return players;
    }

    public void setPlayers(List<Members> players) {
        this.players = players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    
    public void showDetails(){
        System.out.println("\n--- Informações do Time: " + this.teamName + " ---");
        
        System.out.println("\n--- Membros do Time " + this.teamName + " (Polimórfico) ---");
        if (players.isEmpty()) {
            System.out.println("Nenhum membro cadastrado.");
        } else {
            for (Members membro  : players) {
                System.out.println("  - " + membro.getNome() + " (CPF: " + membro.getCpf() + ")");
                membro.validarCpf(); // Chamada polimórfica: Pessoa implementa validarCPF
                membro.jogar();     // Chamada polimórfica: Jogador e Tecnico implementam jogar() de forma diferente
                // Você pode usar 'instanceof' para verificar o tipo e fazer downcasting se necessário
                if (membro instanceof Coach) {
                    ((Coach) membro).organizarTime(); // Chamada específica do Técnico
                    ((Coach) membro).treinar();
                }
            }
        }
    }  
    
    
}
