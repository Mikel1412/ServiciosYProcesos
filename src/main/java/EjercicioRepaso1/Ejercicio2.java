package EjercicioRepaso1;

public class Ejercicio2 {
    static void main(String[] args) {

        //Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la
        //forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.

        /* int j = 0;
        int k = 0; */

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] array3 = new int[20];

        // SOLUCION 1
        for(int j =0; j< array3.length; j=j+2){
            array3[j] = array1[j/2];
            array3[j+1] = array2[j/2];
        }

        // SOLUCION 2

        /* for(int i=0; i < array3.length; i=i+2){
            array3[i]=array1[j];
            array3[i+1]=array2[k];
            j++;
            k++;
        } */

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

}
