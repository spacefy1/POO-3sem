
package com.mycompany.ex3;

import java.util.List;

public class Departament {
    private String departamentName;
    List<Professor> professors;

    public Departament(String departamentName, String professors, String course) {
        this.departamentName = departamentName;
        this.professors = new Professor(professors, departament);
    }
    
    
}
