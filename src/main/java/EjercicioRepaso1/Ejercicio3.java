package EjercicioRepaso1;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        /*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos
        los guardaremos en un array de tamaño 10. Leer un número N, e insertarlo en el lugar
        adecuado para que el array continúe ordenado.*/

        int[] array1 = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 numeros ordenados de forma creciente");
        for (int i = 0; i < 5; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Introduce 5 numeros para ordenarlos en la lista");
        for (int i = 0; i < 5; i++) {
            int nuevoNum = sc.nextInt();



            for (int j = 0; j < array1.length;j++){
                if (nuevoNum > array1[j] && nuevoNum < array1[j+1]) {
                    int guardar = 0, guardar2 = 0;
                    if (j < 8) {
                        guardar = array1[j + 1];
                    }
                    for (int k = j+1; k< array1.length;k++){
                        if (j < 7) {
                            guardar2 = array1[j + 2];
                            array1[j + 1] = nuevoNum;
                            array1[j + 2] = guardar;
                            guardar = guardar2;
                        } else {
                            guardar2=array1[j+1];
                            array1[j] = nuevoNum;
                            array1[j+1] = guardar;
                            guardar = guardar2;
                        }
                    }
                }

            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}