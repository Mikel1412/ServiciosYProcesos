package ProcesosUD1.Ejemplos;

import java.io.IOException;

public class Ejemplo01 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 ProcessBuilder pb = new ProcessBuilder("NOTEPAD");
	     Process p = pb.start();
	}

}