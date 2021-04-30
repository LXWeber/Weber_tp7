package weber_tp7;

import java.util.*;
import javax.swing.JOptionPane;

public class Alumno {
    HashSet <Materia> materias = new HashSet<>();
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo,String apellido, String nombre) {
        this.legajo=legajo;
        this.apellido=apellido;
        this.nombre=nombre;
    }
    
    public void agregarMateria(Materia materia){
        if(materias.add(materia)){
            JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null,"Materia duplicada");
        }
        
    }

    public int cantidadMaterias(){
        return materias.size();
    }
    
    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return (int) this.legajo;
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
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.legajo,other.legajo);
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + " " + apellido + " " + nombre;
    }
    
}
