package com.mycompany.ex2;

public class Ex2 {

    public static void main(String[] args) {
        //por causa da relaçao de composiçao
        //a classe parte (engine) é apenas
        //criada na classe Car
        
        Car c1 = new Car("Wolsvaken", "Hyperx-835");
        Car c2 = new Car("Honda", "Ultra-345ti");
        
        
        c1.showDetails();
        c1.start();
        
        c2.start();
        c2.showDetails();
    }
}
