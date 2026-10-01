package ProcesosUD1.Ejemplos;

import java.io.*;
import java.util.*;

public class Ejemplo06 {
	 public static void main (String[] args) throws IOException{

	        ProcessBuilder test = new ProcessBuilder();

	        Map entorno = test.environment();

	        System.out.println("Variables de entorno: ");
	        System.out.println(entorno);

	        test= new ProcessBuilder("java", "Ejemplo1");

	        List l = test.command();
	        Iterator iter = l.iterator();
	        System.out.println("\nArgumentos del comando: ");

	        while (iter.hasNext()){
				System.out.println(iter.next());
			}

			test.command("CMD","/C","DIR");
			l = test.command();
			iter = l.iterator();
			System.out.println("\nArgumentos del comando: ");
	        while (iter.hasNext()){
				System.out.println(iter.next());
			}
	    }
}
