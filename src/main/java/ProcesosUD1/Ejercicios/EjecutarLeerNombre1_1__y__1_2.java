package ProcesosUD1.Ejercicios;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

public class EjecutarLeerNombre1_1__y__1_2 {
    /*Crea un programa Java llamado LeerNombre.java que reciba desde los argumentos de
main() un nombre y lo visualice en pantalla. Utiliza System.exit(0) para una finalización
correcta del programa y System.exit(-1) para el caso en el que no se hayan introducido
los argumentos correctos en main(). Posteriormente haz un programa similar a
Ejemplo3.java para ejecutar Leernombre.java. Utiliza el metodo waitFor() para
comprobar el valor de salida del proceso que se ejecuta. Prueba la ejecución del
programa pasando un parámetro y sin pasarlo. ¿Qué devuelve waitFor() en cada caso?*/

    /**
     * @throws IOException lanzamos la excepcion para capturar los errores de la lectura de datos
     * Aqui lo que hacemos es ejecutar un programa de java y nos devuelve la salida de la consola
     */

    public static void main(String[] args) throws IOException {

        File d = new File("C:\\Users\\AlumnoD\\Desktop\\EjerciciosRepaso1y2_Servicios\\Mikel_DanielDR\\src\\main\\java\\ProcesosUD1\\Ejercicios");

        ProcessBuilder pb = new ProcessBuilder("java","LeerNombre.java");

        pb.directory(d);
        pb.redirectErrorStream(true); //Ponemos esto para ver los errores de ejecucion
        System.out.print("Directorio de trabajo: ");
        System.out.println(pb.directory());

        Process p = pb.start();

        try {

            InputStream is = p.getInputStream();

            int c;
            while ((c = is.read())!=-1){

                // p.waitFor(Duration.ofSeconds(5));
                System.out.print((char) c);

            }

            boolean exitVal = p.waitFor(Duration.ofSeconds(1)); //Este espera un segundo para que el proceso termine y devuelva true.
            System.out.println("Valor de salida: " + exitVal);  //O, pasa el segundo sin que termine el programa, y nos devuelve un false. (en nuestro caso como el programa es muy corto terminará antes del segundo)
            System.out.println("-----");

            int exitVal2 = p.waitFor(); //No hay limite de tiempo, si el hijo no se ha terminado de ejecutar, el programa se queda esperando hasta que este acabe.
            System.out.println("Valor de salida: " + exitVal2); //Este nos da -1 cuando no pasamos un parametro ("java","LeerNombre.java")
            System.out.println("-----");                        //Este nos da 0 cuando pasamos un parametro ("java","LeerNombre.java","Mikel")
        }                                                       //Este nos da 1 cuando el programa no se ejecuta directamente.
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
