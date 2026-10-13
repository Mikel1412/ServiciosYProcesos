package EjerciciosRA1.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crea una clase Java que calcule cuántos divisores tiene un número que le
    pasaremos por parámetro. El resultado nos los mostrará posteriormente por
    pantalla.*/
public class Ejercicio1 {

    static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Tienes que introducir un numero");
        } else {
            try{
                int numero = Integer.parseInt(args[0]);
                int contadorDivisores = 0;
                List<Integer> listaNumeros = new ArrayList<>();

                for (int i = 1; i < numero + 1; i++) {
                    if (numero % i == 0) {
                        contadorDivisores++; //Contamos cuantos divisores tiene
                        listaNumeros.add(i);
                    }
                }
                System.out.println("El numero tiene " + contadorDivisores + " divisores");//Devolvemos el resultado por pantalla
                for (Integer i : listaNumeros){
                    System.out.print(i);
                }
            }catch (NumberFormatException e){
                System.out.println("Debes de introducir un valor numerico");
            }
        }
    }
}
