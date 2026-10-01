package ProcesosUD1.Ejemplos;

import java.io.IOException;
import java.io.InputStream;

public class Ejemplo02 {

    /**
     *
     * @throws IOException
     * En este programa abrimos el simbolo del sistema, nos posicionamos en el directorio "C" y ejecutamos un DIR
     */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Ejecutamos el proceso DIR
        Process p = new ProcessBuilder("CMD","/C","DIR").start();
        
        //Mostramos caracter a caracer la salida del comando
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
