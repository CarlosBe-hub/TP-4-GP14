/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;


import java.util.ArrayList;
import java.util.HashSet;
import tp.pkg4.gp14.Materia;

/**
 *
 * @author dylan
 */
public class MateriaData {
    
    private final ArrayList<Materia> listaM = new ArrayList<>();
    
    public void guardarM(Materia a) {
        if(a !=null){
        a.setIdmateria(listaM.size()+1);
        listaM.add(a);
            System.out.println("materia guardada "+a);
    }else{
            System.out.println("Error la materia es nula");
        }
    }
    
    public ArrayList<Materia> obtenerM() {
        return new ArrayList<>(listaM);
    }
    
    public void mostrarLista() {
        if(listaM.isEmpty()){
            System.out.println("no hay materias en la lista");
        }else{
        for (Materia materia : listaM) {
            System.out.println(materia);
        }   
    }
}
}