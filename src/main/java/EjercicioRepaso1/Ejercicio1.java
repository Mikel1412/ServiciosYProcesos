package EjercicioRepaso1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Leer 5 números y mostrarlos en el mismo orden introducido.

        int[] array1 = new int[5];

        System.out.println("Introduce 5 numeros");

        for (int i=0;i<array1.length;i++) {
            array1[i]=leer.nextInt();
        }

        System.out.println("");
        System.out.println("estos son los numeros");

        for (int i=0;i<array1.length;i++) {
            System.out.println(array1[i]);
        }

    }

}
