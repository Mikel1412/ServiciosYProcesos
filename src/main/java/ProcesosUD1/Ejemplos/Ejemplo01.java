package ProcesosUD1.Ejemplos;

import java.io.IOException;

public class Ejemplo01 {

	/**
	 *
	 * @throws IOException
	 * @apiNote Este programa nos abre el bloc de notas usando el processBuilder
	 */
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 ProcessBuilder pb = new ProcessBuilder("NOTEPAD");
	     Process p = pb.start();
	}

}