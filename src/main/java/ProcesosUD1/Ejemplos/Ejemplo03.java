package ProcesosUD1.Ejemplos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//creamos objeto File al directorio donde esta Ejemplo2
        //No olvidarse de poner en windows el .java despues del nombre de la clase
        File d = new File("C:\\Users\\AlumnoD\\Desktop\\EjerciciosRepaso1y2_Servicios\\Mikel_DanielDR\\src\\main\\java\\ProcesosUD1\\Ejemplos\\");
        //proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java","Ejemplo02.java");
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
