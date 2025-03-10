
package com.mycompany.poo0310;


public class teste {

    static boolean getQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int a;
    public int b;
    public int c;
    
    public static int quantidade = 0;
    
    public teste (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        quantidade++;
    }
    public int getC(int c){  
        return c;
    }
    
    public int getQuantidade (int quantidade){  
        return quantidade;
    }
   
    public void setC(int c){  
        this.c = c;
    }
    
    public void ImprimeA(){  
        System.out.println("Valor de A é: "+a); 
    }
    
}
