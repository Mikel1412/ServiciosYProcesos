package RA1_2;

import java.io.IOException;
import java.io.InputStream;

public class HacerPingGoogle {
    static void main() throws IOException {

        String[] sistemaElegido;
        sistemaElegido = System.getProperty("os.name").split(" ");

        Process p = null;

        if (sistemaElegido[0].equals("Windows")){
            p = new ProcessBuilder("CMD", "/c", "ping", "-n", "4", "google.com").start();
        } else if (sistemaElegido[0].equals("Linux")) {
            p = new ProcessBuilder("CMD", "-c", "ping", "4", "google.com").start()
        } else {
            System.out.println("Sistema desconocido");
        }
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
