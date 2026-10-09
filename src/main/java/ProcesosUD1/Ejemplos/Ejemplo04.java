package ProcesosUD1.Ejemplos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejemplo04 {

    /**
     * @throws IOException
     * @apiNote Este programa ejecuta el cmd y introduce una serie de comandos, nos permite
     * introducirle datos gracias el metodo getOutputStream() y con el metodo write() se
     * envian los bytes al stream, usaremos el metodo getBytes() dentro del metodo write()
     * para que codifique la cadena
     *
     */
    static void main(String[] args) throws IOException {
        Process p = new ProcessBuilder("CMD", "\\C", "DATE").start();
//escritura
        OutputStream os = p.getOutputStream();
        os.write("15-06-18".getBytes());
        os.flush();
//lectura
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//comprobacion de error - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
