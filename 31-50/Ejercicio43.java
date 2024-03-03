/*
 * 43.Crear una función que calcule cual es el número menor de dos números enteros
 */

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double n1 = read.nextDouble();
        System.out.print("Ingrese el primer numero: ");
        double n2 = read.nextDouble();
        numeroMenor(n1, n2);
        read.close();
    }

    public static void numeroMenor(double n1, double n2) {

        if (n1 > n2) {
            System.out.println("El número " + n2 +  " es menor");
        } else if (n2 > n1) {
            System.out.println("El número " + n1 +  " es menor");
        } else {
            System.out.println("Ambos numeros son igualea");
        }
   
    }
}
