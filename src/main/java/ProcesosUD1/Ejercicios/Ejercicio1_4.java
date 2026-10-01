package ProcesosUD1.Ejercicios;

import java.io.*;
/*Modifica el Ejemplo5.java para que la salida del proceso y la salida del error se
almacenen en un fichero de texto, y la entrada la recoja desde otro fichero de texto.
*/

public class Ejercicio1_4 {
    static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "C:\\Users\\mikel\\IdeaProjects\\ServiciosYProcesos\\src\\main\\java\\ProcesosUD1\\Ejemplos\\Ejemplo04.java");


        File fBat = new File("fichero.bat");
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");

        // se ejecuta el proceso
        Process p = pb.start();

        // escritura -- envia entrada
        pb.redirectInput(fBat);

        // lectura -- obtiene la salida
        pb.redirectOutput(fOut);

        // COMPROBACION DE ERROR - 0 bien - 1 mal
        pb.redirectError(fErr);

        pb.start();
    }

}// Ejemplo5