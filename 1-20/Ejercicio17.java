/*
 * 17.Algoritmo que determine el número mayor de 2 leídos
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Algoritmo que determina que número es mayor");
        System.out.print("Ingrese el primer número: ");
        double n1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double n2 = leer.nextDouble();

        if (n1 < n2) {
            System.out.println("El " + n1  + " es menor que " + n2);
        }else if (n1 == n2) {
            System.out.println("Ambos números son iguales");
        } 
        else {
            System.out.println("El " + n1  + " es mayor que " + n2);
        }
        leer.close();
    }
}
