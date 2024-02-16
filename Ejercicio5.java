/*
 * 5. Programa que pida los datos necesarios y muestre en pantalla el área de un rombo
 */


import java.util.*;

public class Ejercicio5 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Calcular el área de un rombo");
        System.out.println("Ingrese la diagonal mayor: ");
        double dMayor = read.nextDouble();
        System.out.println("Ingrese la diagonal menor: ");
        double dMenor = read.nextDouble();

        double area = (dMayor * dMenor) / 2;
        System.out.println("El Área del rombo es: " + area);

    }
}
