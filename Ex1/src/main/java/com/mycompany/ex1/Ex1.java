
package com.mycompany.ex1;

public class Ex1 {

    public static void main(String[] args) {
        
        Coach c1 = new Coach("Carlo Ancelloti", "657.235-43"); 
        Coach c2 = new Coach("Felipe Luis", "455.354-90"); 
        Coach c3 = new Coach("adg", "43590541");
        
        Team team = new Team("Internazionale", c1); 
        Team team1 = new Team("Bayern Munich", c2);
        Team team2 = new Team("Milan", c3); 
        
        /*in this case the players would play in every 
        team instantiation, but it would be if the relation 
        is aggregation, but the relation between 
        player and team is composition 
        
        Player p1 = new Player("Zlatan", "1"); 
        Player p2 = new Player("Zico", "2"); 
        Player p3 = new Player("Imperador", "3"); 
        Player p4 = new Player("Ronaldinho Gaucho", "4"); 
        Player p5 = new Player("Pirque", "5"); 
        Player p6 = new Player("Sergio Ramos", "6"); 
        Player p7 = new Player("Henry Kane", "7"); 
        Player p8 = new Player("Pele", "8"); 
        Player p9 = new Player("Maradona", "9"); 
        Player p10 = new Player("Luka Modric", "10"); 
        Player p11 = new Player("Garrincha", "11"); 
        */
            
        //in the composition relation to add the 
        //objetcs in the lists, i gotta do this
        team.addPlayer("Zlatan", "1");
        team.addPlayer("Zico", "2");
        team.addPlayer("Imperador", "3");
        team.addPlayer("Ronaldinho Gaucho", "4");
        team.addPlayer("Pirque", "5");
        team.addPlayer("Sergio Ramos", "6");
        team.addPlayer("Henry Kane", "7");
        team.addPlayer("Pele", "8");
        team.addPlayer("Maradona", "9");
        team.addPlayer("Luka Modric", "10");
        team.addPlayer("Garrincha", "11");
        
        team1.addPlayer("Zlatan", "1");
        team1.addPlayer("Zico", "2");
        team1.addPlayer("Imperador", "3");
        team1.addPlayer("Ronaldinho Gaucho", "4");
        team1.addPlayer("Pirque", "5");
        team1.addPlayer("Sergio Ramos", "6");
        team1.addPlayer("Henry Kane", "7");
        team1.addPlayer("Pele", "8");
        team1.addPlayer("Maradona", "9");
        team1.addPlayer("Luka Modric", "10");
        team1.addPlayer("Garrincha", "11");

        team.showDetails();
        team1.showDetails();
        team2.showDetails();
      
    }
}
