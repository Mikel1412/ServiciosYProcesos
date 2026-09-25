package EjercicioRepaso2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner leer = new Scanner(System.in);

        String nombre;
        double nota;
        double sumaNotas = 0;
        int cantidad = 0;

        List<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Juan",8);
        Alumno alumno2 = new Alumno("Mohilla",7);
        Alumno alumno3 = new Alumno("Mikel",6.5);
        Alumno alumno4 = new Alumno("Daniel",9);
        Alumno alumno5 = new Alumno("Jorge",8);
        Alumno alumno6 = new Alumno("Navarro");

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);

        for (Alumno e : alumnos) {
            if (e.getNota()!=0) {
                sumaNotas += e.getNota();
                cantidad++;
            }
        }

        //Solo hace la media por los alumnos que tienen una nota.
        System.out.println("La nota media de los alumnos es: " +sumaNotas/cantidad);





    }
}
