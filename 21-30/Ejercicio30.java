/*
 * 30.Que permita leer el valor correspondiente a una distancia en kilómetros y las
 * visualice expresadas en metros.
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("De kilómetros a metros");
        System.out.print("Ingrese la distancia en kilómetros: ");
        double kilo = read.nextDouble();
        System.out.println( kilo + " kilómetros en metros es: " + (kilo * 1000));
        // for (int i = 0; i < (kilo * 1000); i++) {
        //     System.out.print(" - ");
        // }
        // System.out.println("");
        // System.out.println("Donde cada linea representa un metro");
        read.close();
    }
}
