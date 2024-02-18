/*
 * 15.Algoritmo que determine si una persona es mayor o menor de edad
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = read.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
        read.close();
    }
}
