/*
 *  Programa que calcula la media aritmética de tres números cuales quiera dados por
 *  el usuario.
 */

import java.util.*;

public class Ejercicio6 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Programa que calcula la media aritmética");
        System.out.println("");
        System.out.print("Ingrese el primer número: ");
        double n1 = read.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double n2 = read.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double n3 = read.nextDouble();

        double mediaAritmetrica = (n1 + n2 + n3) / 3;
        System.out.println("La media aritmética es: " + mediaAritmetrica);
    }
}
