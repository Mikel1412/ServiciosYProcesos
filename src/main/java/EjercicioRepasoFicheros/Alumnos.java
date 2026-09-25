package EjercicioRepasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Collections;

public class Alumnos {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

//		1) tienes que tener un .txt con información de alumnos, dónde cada línea es un alumno,
//		la información será: nombre,edad,DNI, asignaturas (pueden ser varias), todo separado por comas

        /* creado, es el fichero alumnos.txt */

//		2) el programa debe recibir 2 parámetros, uno que indique dónde está el archivo y otro que te diga
//		la edad (para agarrar a los que tengan más de esa edad)

//		3) ordenar los alumnos por orden alfabético (puede ser ascendiente o descendiente)

//		4) poner el resultado de ordenación en un .csv

        int opcion;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Buscar fichero");
            System.out.println("2. mostrar alumnos por Edad (escoger a los que tienen la misma o mayor edad)");
            System.out.println("3. Orden alfabetico ASCENDENTE (y lo ponemos en un .CSV)");
            System.out.println("4. Orden alfabetico DESCENDENTE (y lo ponemos en un .CSV)");
            System.out.println("5. Salir");

            opcion=leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1: {

                    String fichero;

                    System.out.println("Introduce el nombre del fichero para ver su ruta");
                    fichero=leer.nextLine();

                    File f = new File(fichero);

                    if (f.exists()) {
                        System.out.println(f.getAbsolutePath());
                    } else {
                        System.out.println("no existe este fichero");
                    }

                    break;
                }
                case 2: {

                    int edadIntroducida = 0;

                    String cadena;
                    String fichero = "alumnos.txt";

                    String[] partes;

                    File f = new File(fichero);

                    FileReader fr = null;
                    BufferedReader bf = null;

                    System.out.println("filtra los alumnos por edad (se mostraran los de la misma o mayor edad)");
                    edadIntroducida=leer.nextInt();

                    try {
                        fr = new FileReader(f);
                        bf = new BufferedReader(fr);

                        while((cadena=bf.readLine())!=null) {
                            partes=cadena.split(",");

                            int edadAlumno = Integer.parseInt(partes[1]);

                            if (edadAlumno>=edadIntroducida) {
                                System.out.println(cadena);
                            }
                        }
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    break;
                }
                case 3: {

                    List<String> lineas = new ArrayList<>();

                    try (BufferedReader br = new BufferedReader(new FileReader("alumnos.  txt"))) {
                        String cadena;
                        while ((cadena = br.readLine()) != null) {
                            if (!cadena.isEmpty()) {
                                lineas.add(cadena);
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Error al leer el fichero: " + e.getMessage());
                        break;
                    }

                    /* FALTA AQUI EN MEDIO EL ORDEN ASCENDENTE */
                    //lineas.sort();

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos_ascendente.csv"))) {
                        for (String l : lineas) {
                            bw.write(l);
                            bw.newLine();
                        }
                        System.out.println("Fichero alumnos_ascendente.csv creado correctamente");
                    } catch (IOException e) {
                        System.out.println("Error al escribir el fichero: " + e.getMessage());
                    }



                    break;
                }
                case 4: {

                    List<String> lineas = new ArrayList<>();

                    try (BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"))) {
                        String cadena;
                        while ((cadena = br.readLine()) != null) {
                            if (!cadena.isEmpty()) {
                                lineas.add(cadena);
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Error al leer el fichero: " + e.getMessage());
                        break;
                    }

                    /* FALTA AQUI EN MEDIO EL ORDEN DESCENDENTE */
                    lineas.sort(Collections.reverseOrder());

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos_descendente.csv"))) {
                        for (String l : lineas) {
                            bw.write(l);
                            bw.newLine();
                        }
                        System.out.println("Fichero alumnos_descendente.csv creado correctamente");
                    } catch (IOException e) {
                        System.out.println("Error al escribir el fichero: " + e.getMessage());
                    }

                    break;
                }
                case 5: {

                    System.out.println("Saliendo...");

                    break;
                }
                default:
                    throw new IllegalArgumentException("No es un valor válido, vuelva a intentarlo" + opcion);
            }
        } while (opcion!=5);

    }
}