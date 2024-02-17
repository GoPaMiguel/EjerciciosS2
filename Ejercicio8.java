/*
 * 8. Programa que calcula el resto de cualquier división entera.
 */

import java.util.*;

public class Ejercicio8 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("calcula el resto de un división...");
        System.out.print("Ingrese el númerador: ");
        int numerador = read.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = read.nextInt();
        int cociente = numerador % denominador;
        System.out.println("El cociente es: " + cociente);
        read.close();
    }
}
