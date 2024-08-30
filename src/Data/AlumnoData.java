/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import tp.pkg4.gp14.Alumno;

/**
 *
 * @author dylan
 */
public class AlumnoData {
    
    private final ArrayList<Alumno> listaA = new ArrayList<>();

    public void guardarA(Alumno a) {
        if(a !=null){
        a.setNrolegajo(listaA.size());
        listaA.add(a);
        
        System.out.println("alumno agregado");
        }else{
            System.out.println("No hay alumnos");
        }
    }

    public ArrayList<Alumno> obtenerA() {
        return new ArrayList<>(listaA);
    }

    public void mostrarLista() {
        if(listaA.isEmpty()){
            System.out.println("no hay alumnos en la lista");
        }else{
        for (Alumno alumno : listaA) {
            System.out.println(alumno);
            }
        }
    }
    
    
}
