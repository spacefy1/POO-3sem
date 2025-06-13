
package com.mycompany.ex3;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String professorName;
    private Departament departament;
    List<Course> courses = new ArrayList<>();

    public Professor(String professorName, Departament departament) {
        this.professorName = professorName;
        this.departament = departament;
        courses.addProfessor(this.get); 
    }
    
    
    
    
}
