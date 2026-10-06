package EjerciciosRA1.Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio2 {

    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);
        String numero;

        System.out.println("Introduce un numero");
        numero = sc.nextLine();

        File f = new File(".\\src\\main\\java\\EjerciciosRA1\\Ejercicio2");

        ProcessBuilder pb = new ProcessBuilder("java", "Hijo2.java", numero);

        pb.directory(f);
        Process p = pb.start();

        /*try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read())!=-1){
                System.out.print((char) c);
            }
            is.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }*/

        String resul = new String(p.getInputStream().readAllBytes());
        System.out.println(resul);
    }

}
