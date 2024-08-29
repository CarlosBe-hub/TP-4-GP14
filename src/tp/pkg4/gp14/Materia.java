/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4.gp14;

import java.util.Objects;

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
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idmateria;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.año;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idmateria != other.idmateria) {
            return false;
        }
        if (this.año != other.año) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
}
