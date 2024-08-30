/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4.gp14;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dylan
 */
public class Colegio {
    
    public static Set<Alumno> alumno = new HashSet<>();
    public static Set<Materia> materia = new HashSet<>();
    
    public static void main(String[] args) {
        
        Materia m1 = new Materia(1,"Ingles 1",1);
        Materia m2 = new Materia(2,"Matematicas",1);
        Materia m3 = new Materia(3,"Laboratorio 1",1);
        
        Alumno a1 = new Alumno(1001,"Lopez"," Martin");
        Alumno a2 = new Alumno(456,"Martinez "," Brenda");
        
        materia.add(m1);
        materia.add(m2);
        materia.add(m3);
        
        alumno.add(a1);
        alumno.add(a2);
        
        //inscripciones
        a1.agregarMaterias(m1);
        a1.agregarMaterias(m2);
        a1.agregarMaterias(m3);
        
        a2.agregarMaterias(m1);
        a2.agregarMaterias(m2);
        a2.agregarMaterias(m3);
        a2.agregarMaterias(m3);
        
        System.out.println("Alumno 1 = "+a1.toString());
        System.out.println("Alumno 2 = "+a2.toString());
        
    }
}
