/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4.gp14;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author aguse
 */
public class Alumno {
    private int nrolegajo;
    private String apellido;
    private String nombre;
    private Set <Materia> materias;

    public Alumno(int nrolegajo, String apellido, String nombre) {
        this.nrolegajo = nrolegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public Alumno() {
    }
    

    public int getNrolegajo() {
        return nrolegajo;
    }

    public void setNrolegajo(int nrolegajo) {
        this.nrolegajo = nrolegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMaterias(Materia materia){
        if(materias.contains(materia)){
            System.out.println("El alumno ya esta inscripto en esta materia");
        
        }
        else{
            materias.add(materia);
        }
    
    }
    
    public int cantidadMaterias(){
        return materias.size();
        
      
    }

    @Override
    public String toString() {
        return apellido + nombre;
    }
    
}
