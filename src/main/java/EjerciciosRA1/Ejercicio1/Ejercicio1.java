package EjerciciosRA1.Ejercicio1;

import java.util.Scanner;

/*Crea una clase Java que calcule cuántos divisores tiene un número que le
    pasaremos por parámetro. El resultado nos los mostrará posteriormente por
    pantalla.*/
public class Ejercicio1 {

        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;

            System.out.println("Introduce un numero para saber cuantos divisores tiene");
            numero = sc.nextInt(); //Pedimos el numero por pantalla

            int contadorDivisores = 0;

            for (int i = 1; i < numero+1;i++){
                if( numero % i == 0){
                    contadorDivisores++; //Contamos cuantos divisores tiene
                }
            }
            System.out.println("El numero tiene " + contadorDivisores + " divisores"); //Devolvemos el resultado por pantalla
        }
}
