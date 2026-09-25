package ProcesosUD1.Ejercicios;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class EjecutarEjercicios {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //creamos objeto File al directorio donde esta Ejemplo2
        File d = new File("C:\\Users\\AlumnoD\\Desktop\\EjerciciosRepaso1y2_Servicios\\Mikel_DanielDR\\src\\main\\java\\ProcesosUD1\\Ejercicios");
        //proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java","LeerNombre.java", "bingo bango");
        //establecemos el directorio donde est� el ejecutable
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

        //Vemos si se ha producido algun error
        try {
            InputStream er = p.getErrorStream();
            int c;
            while ((c = er.read())!=-1){
                System.out.print((char) c);
            }
            er.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
