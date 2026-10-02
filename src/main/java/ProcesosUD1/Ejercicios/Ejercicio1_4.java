package ProcesosUD1.Ejercicios;

import java.io.*;
/*Modifica el Ejemplo5.java para que la salida del proceso y la salida del error se
almacenen en un fichero de texto, y la entrada la recoja desde otro fichero de texto.
*/

public class Ejercicio1_4 {
    /**
     * @throws IOException
     * @apiNote Aquí lo que hacemos es crear los ficheros de salida, entrada y error. Ejecutamos el programa desde esos ficheros y recibimos la salida desde ahi también
     * @apiNote La ruta relativa la cogemos desde la carpeta principal del proyecto
     * @apiNote Es importante inicar el processBuilder después de haber definido las redirecciones a los ficheros, si no se queda esperando y no hace nada
     *
     */
    static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", ".\\src\\main\\java\\ProcesosUD1\\Ejemplos\\Ejemplo02.java");

        File fBat = new File("fichero.bat");
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");


        // escritura -- envia entrada
        pb.redirectInput(fBat);

        // lectura -- obtiene la salida
        pb.redirectOutput(fOut);

        // COMPROBACION DE ERROR - 0 bien - 1 mal
        pb.redirectError(fErr);

        // se ejecuta el proceso
        Process p = pb.start();
    }

}// Ejemplo5