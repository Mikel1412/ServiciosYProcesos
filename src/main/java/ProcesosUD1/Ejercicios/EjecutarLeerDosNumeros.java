package ProcesosUD1.Ejercicios;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EjecutarLeerDosNumeros {

    /**
     * @throws IOException
     * @apiNote Aqui lo que hacemos es ejecutar el programa LeerDosNumeros y nos devuelve la salida de la consola,
     * tambien comprobamos que lo que recibe el programa por consola sean numeros y no otros caracteres
     */
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        //creamos objeto File al directorio donde esta Ejemplo2
        //No olvidarse de poner en windows el .java despues del nombre de la clase

        File d = new File(".\\src\\main\\java\\ProcesosUD1\\Ejercicios");

        String num1;
        String num2;
        System.out.println("Introduce dos numeros");
        num1=sc.nextLine();
        num2=sc.nextLine();
        //proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java","LeerDosNumeros.java", num1, num2
        );

        //establecemos el directorio donde esta el ejecutable
        pb.directory(d);
        System.out.print("Directorio de trabajo: ");
        System.out.println(pb.directory());

        //ejecutar proceso
        Process p = pb.start();

        //obtener la salida
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read())!=-1){
                System.out.print((char) c);
            }
            is.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
