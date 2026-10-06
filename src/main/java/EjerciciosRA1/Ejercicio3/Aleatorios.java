package EjerciciosRA1.Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aleatorios {
    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);

        File f = new File(".\\src\\main\\java\\EjerciciosRA1\\Ejercicio3");
        ProcessBuilder  pb = new ProcessBuilder("java", "GenerarAleatorios.java");
        pb.directory(f);

        String lineas="";
        do {
            System.out.println("Introduce un texto");
            lineas = sc.nextLine();

            Process p =pb.start();

            String resul = new String(p.getInputStream().readAllBytes());
            System.out.println(resul);
        }while(!lineas.equals("fin"));



        Process p =pb.start();

        String resul = new String(p.getInputStream().readAllBytes());
        System.out.println(resul);
    }
}
