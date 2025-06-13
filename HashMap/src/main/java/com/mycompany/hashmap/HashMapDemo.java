package com.mycompany.hashmap;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo {

    public static void main(String[] args) {
        
    // Create a HashMap object called people
    Map<String, Integer> people = new HashMap<>();
    Map<String, String> capital = new HashMap<>();
    
    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    capital.put("Brasil", "Brasilia");
    capital.put("Caracas", "Venezuela");
            
    for (String i : people.keySet()) {
        System.out.println("Name: " + i + " Age: " + people.get(i));
    }
    
    for (String a : capital.keySet()){
        System.out.println("Pais " + a + " Capital: " + capital.get(a));
    }
    
  }
    
}
