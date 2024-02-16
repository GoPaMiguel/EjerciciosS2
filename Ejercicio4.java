/*
 * 4. Programa que obtenga el área de un círculo, a partir de datos proporcionados por
 * el usuario. 
 */

 import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Programa Que Obtiene el área de un círculo");
        System.out.print("Ingrese el radio del círculo: ");
        Scanner read = new Scanner(System.in);
        double radio = read.nextDouble();

        double a = 3.14 * Math.pow(radio, 2);
        System.out.println("El Área del círculo es: " + a);
        read.close();
    }
}
