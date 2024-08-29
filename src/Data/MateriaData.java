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
        a.setIdmateria(listaM.size());
        listaM.add(a);
    }
    
    public ArrayList<Materia> obtenerM() {
        return listaM;
    }
    
    public void mostrarLista() {
        for (Materia materia : listaM) {
            System.out.println(materia.toString());
        }
    }
}
