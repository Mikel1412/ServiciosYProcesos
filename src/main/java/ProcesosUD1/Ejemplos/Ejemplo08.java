package ProcesosUD1.Ejemplos;

import java.io.*;

public class Ejemplo08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("CMD");

        File fBat = new File("Aleatorio.bat");
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");

        pb.redirectInput(fBat);
        pb.redirectOutput(fOut);
        pb.redirectError(fErr);

        pb.start();
	}

}
