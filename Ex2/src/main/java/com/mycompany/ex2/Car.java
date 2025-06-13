package com.mycompany.ex2;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name, String engineModel) {
        this.name = name;
        this.engine = new Engine(engineModel); //relacionamento de composiçao
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public void start(){
        System.out.println("Car: " + this.getName() + ", With Engine: " + 
                            engine.getModel() + " is starting.");
    }
    
    public void showDetails(){
        System.out.println("Car{" + "name=" + name + ", engine=" + engine.getModel() + '}');
    }
    
}
