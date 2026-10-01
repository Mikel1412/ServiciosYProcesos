package ProcesosUD1.Ejercicios;

public class LeerNombre1_1 {
    /*Crea un programa Java llamado LeerNombre.java que reciba desde los argumentos de
main() un nombre y lo visualice en pantalla. Utiliza System.exit(0) para una finalización
correcta del programa y System.exit(-1) para el caso en el que no se hayan introducido
los argumentos correctos en main(). Posteriormente haz un programa similar a
Ejemplo3.java para ejecutar Leernombre.java. Utiliza el metodo waitFor() para
comprobar el valor de salida del proceso que se ejecuta. Prueba la ejecución del
programa pasando un parámetro y sin pasarlo. ¿Qué devuelve waitFor() en cada caso?*/

    /**
     *
     * @param args Aqui recogemos el/los parametro/s que nos entran desde la consola u otro programa para utilizarlos mas tarde
     *
     * Lo que hacemos aqui es que si la longitud de args es mayor de 0, es decir, contiene información, mostraremos
     * por pantalla lo que hemos introducido desde la consola.
     * Si no hay nada, la consola nos devolverá -1 en el system exit
     **/
    public static void main(String[] args) {


        if (args.length != 0){
            for(String arg : args){
                System.out.println(arg); //Se mostrarian todas las palabras que pondriamos en el CMD
            }
            System.exit(0);
        } else {
            System.exit(-1);
        }

    }

}

//Para Ejecutarlo En La Terminal:
//1.Desde La Terminal Entramos En La Carpeta ->
// C:\Users\AlumnoD\Desktop\EjerciciosRepaso1y2_Servicios\Mikel_DanielDR\src\main\java
//O Donde Tengamos Ubicado El Proyecto

//2.Compilamos el Proyecto con -> javac -d . ProcesosUD1\Ejercicios\LeerNombre.java
//Esto es para decirle a la terminal donde guardar el archivo .class ya compilado

//3. y Lo Ejecutamos Con -> java ProcesosUD1.Ejercicios.LeerNombre "Argumento"

