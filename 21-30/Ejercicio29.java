/*
 * 29.Crear una función que permita calcular el cubo de un número real (float)
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("calcular el cubo de un número real");
        System.out.print("Ingrese un número real: ");
        float n = read.nextFloat();
        System.out.println( n + " al cubo es: " + (Math.pow(n, 3)));
        read.close();
    }
}
