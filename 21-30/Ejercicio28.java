/*
 * 28.Programa que muestre en pantalla una cuenta atrás de números tomando en
 * cuenta el número leído de teclado (ej. 7,6,5,4,3,2,1,0).
 */

import java.util.*;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuenta hacia atras");
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("-------------------------");
        for (int i = 0; i <= numero; i++) {
            System.out.println(numero - i);
        }
        scanner.close();
    }
}
