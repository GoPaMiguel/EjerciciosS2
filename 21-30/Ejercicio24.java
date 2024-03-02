/*
 * 24.Programa que de acuerdo a una cantidad de pulgadas ingresadas por teclado,
 * realice la conversión a centímetros. (1plg=2.54cm).
*/

import java.util.Scanner;

public class Ejercicio24 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("conversión de pulgadas a centímetros");
        System.out.print("Ingrese la medida en pulgadas: ");
        double pulgadas = read.nextDouble();
        double cm = pulgadas * 2.54;
        System.out.println("La conversión da como resultado: " + cm + " centímetros");
    }
}
