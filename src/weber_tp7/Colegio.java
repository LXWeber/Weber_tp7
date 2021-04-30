package weber_tp7;

public class Colegio {

    public static void main(String[] args) {
        
        //-A) Crear las materias:
        Materia ingles1 = new Materia(1,"Ingles",1);
        Materia matematicas1 = new Materia(2,"Matematicas",1);
        Materia laboratorio1 = new Materia(3,"Laboratorio1",1);
        
        //-B) Crear 2 alumnos:
        Alumno lopezMartin = new Alumno(1001,"Lopez","Martin");
        Alumno martinezBrenda = new Alumno(1002,"Martinez","Brenda");
        
        //-C) Inscribir a López en las 3 materias:
        lopezMartin.agregarMateria(ingles1);
        lopezMartin.agregarMateria(matematicas1);
        lopezMartin.agregarMateria(laboratorio1);
        
        //-D)  Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1:
        martinezBrenda.agregarMateria(laboratorio1);
        martinezBrenda.agregarMateria(matematicas1);
        martinezBrenda.agregarMateria(ingles1);
        martinezBrenda.agregarMateria(laboratorio1);
        
        //-E) Visualizar la cantidad de materias a las que está inscripto cada alumno:
        System.out.println(lopezMartin.cantidadMaterias());
        System.out.println(martinezBrenda.cantidadMaterias());
    }
    
}
