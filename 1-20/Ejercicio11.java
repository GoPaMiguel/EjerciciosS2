/*
 * 11. Hallar el área de un rectángulo
 */

import java.util.*;

public class Ejercicio11 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa que calcula el área de un rectángulo...");
        System.out.print("Ingrese el ancho: ");
        float a = read.nextFloat();

        System.out.print("Ingrese el largo: ");
        float l = read.nextFloat();
        if (a == l) {
            System.out.println("Ambos lados del rectángulo no pueden medir lo mismo, de ser asi es un cuadrado");
        } else {
            float area = a * l;
            System.out.println("El área del rectángulo es: " + area);
        }

    }
}
