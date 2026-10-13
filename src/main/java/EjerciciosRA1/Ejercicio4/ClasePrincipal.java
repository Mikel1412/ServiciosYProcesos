package EjerciciosRA1.Ejercicio4;

import java.io.IOException;
import java.util.Scanner;

public class ClasePrincipal {
    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);
        int accionDeseada = 0;
        String[] sistemaElegido;
        int tiempoEspera = 0;

        ProcessBuilder pb = null;

        System.out.println("¿Que quieres hacer? \n1. Apagar \n2. Reiniciar \n3. Suspender");
        accionDeseada = sc.nextInt();

        System.out.println("Elige el tiempo de espera para la accion elegida");
        tiempoEspera = sc.nextInt();

        sistemaElegido = System.getProperty("os.name").split(" ");

        switch (sistemaElegido[0]) {
            case "Windows":
                switch (accionDeseada) {
                    case 1:
                        pb = new ProcessBuilder("CMD", "shutdown /s /t " + tiempoEspera);
                        break;
                    case 2:
                        pb = new ProcessBuilder("CMD", "shutdown /r /t " + tiempoEspera);
                        break;
                    case 3:
                        pb = new ProcessBuilder("CMD", "timeout /t " +tiempoEspera + " /nobreak && rundll32.exe");
                        break;
                    default:
                        System.out.println("Accion elegida no reconocida");
                        break;
                }
                break;
            case "Linux":
                switch (accionDeseada) {
                    case 1:
                        pb = new ProcessBuilder("CMD", "shutdown -h " + tiempoEspera);
                        break;
                    case 2:
                        pb = new ProcessBuilder("CMD", "shutdown -r " + tiempoEspera);
                        break;
                    case 3:
                        pb = new ProcessBuilder("CMD", "sleep" + tiempoEspera + "systemctl suspend ");
                        break;
                    default:
                        System.out.println("Accion elegida no reconocida");
                        break;

                }
                break;
        }
        pb.start();
        for (String p : pb.command()){
            System.out.println(p);
        }
        ProcessBuilder noApagar = new ProcessBuilder("CMD", "shutdown /a");
        noApagar.start();
    }
}
