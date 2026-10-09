package EjerciciosRA1.Ejercicio4;

import java.util.Scanner;

public class ClasePrincipal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int accionDeseada = 0;
        int sistemaElegido = 0;
        int tiempoEspera = 0;

        ProcessBuilder pb;

        System.out.println("¿Que quieres hacer? \n1. Apagar \n2. Reiniciar \n3. Suspender");
        accionDeseada = sc.nextInt();

        System.out.println("¿Que sistema tienes? \n1. Windows \n2. Linux");
        sistemaElegido = sc.nextInt();

        System.out.println("Elige el tiempo de espera para la accion elegida");
        tiempoEspera = sc.nextInt();


        switch (sistemaElegido) {
            case 1:
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
                }
                break;
            case 2:
                switch (accionDeseada) {
                    case 1:
                        pb = new ProcessBuilder("CMD", "shutdown -h " + tiempoEspera);
                        break;
                    case 2:
                        pb = new ProcessBuilder("CMD", "shutdown -r " + tiempoEspera);
                        break;
                    case 3:
                        pb = new ProcessBuilder("CMD", "systemctl suspend " + tiempoEspera);
                        break;
                }
                break;
        }
    }
}
