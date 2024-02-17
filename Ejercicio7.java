/*
 * Programa para determinar si un número dado por el usuario es positivo o negativo.
 */

import java.util.*;

public class Ejercicio7 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa que determina si un número es negativo o positivo...");
        System.out.print("Ingrese un número: ");
        double n = read.nextDouble();

        if (n > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (n == 0) {
            System.out.println("El 0 no pertenece ni a los número negativos ni a los positivos");
        } else {
            System.out.println("El número ingresado es negativo");
        }
    }
}