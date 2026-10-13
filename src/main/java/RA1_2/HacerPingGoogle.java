package RA1_2;

import java.io.IOException;
import java.io.InputStream;

public class HacerPingGoogle {
    static void main() throws IOException {



        Process p = new ProcessBuilder("CMD", "/c", "ping", "-n", "4", "google.com").start();

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
