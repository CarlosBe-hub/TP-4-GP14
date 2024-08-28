/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4.gp14;

/**
 *
 * @author aguse
 */
public class Materia {
    private int idmateria;
    private String nombre;
    private int año;

    public Materia(int idmateria, String nombre, int año) {
        this.idmateria = idmateria;
        this.nombre = nombre;
        this.año = año;
        
    }

    public Materia() {
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "idmateria: " + idmateria + ", nombre: " + nombre + ", a\u00f1o:" + año;
    }
    
    
}
