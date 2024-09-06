/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;


import Jframe.menuPrincipal;
import java.util.ArrayList;
import java.util.HashSet;
import tp.pkg4.gp14.Materia;
import Jframe.menuPrincipal;
import java.util.Set;

/**
 *
 * @author dylan
 */
public class MateriaData {
    
    
    
    public void guardarM(Materia a) {
        if(a !=null){
        a.setIdmateria(2);
        menuPrincipal.materias.add(a);
            System.out.println("materia guardada "+a);
    }else{
            System.out.println("Error la materia es nula");
        }
    }
    
    public Set<Materia> obtenerM() {
        return menuPrincipal.materias;
    }
    
    public void mostrarLista() {
        if(menuPrincipal.materias.isEmpty()){
            System.out.println("no hay materias en la lista");
        }else{
        for (Materia materia : menuPrincipal.materias) {
            System.out.println(materia);
        }   
    }
}
}