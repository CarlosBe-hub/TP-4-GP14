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
        a.setNrolegajo(listaA.size());
        listaA.add(a);
        
        System.out.println("");
    }

    public ArrayList<Alumno> obtenerA() {
        return listaA;
    }

    public void mostrarLista() {
        for (Alumno alumno : listaA) {
            System.out.println(alumno.toString());
        }
    }
    
    
}
