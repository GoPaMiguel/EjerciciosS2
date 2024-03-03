/*
 * 42.Una naranja tiene la capacidad de producir 0.05 voltios. Si un sistema de
 * iluminación requiere de x kilovoltios para su funcionamiento. Cuántas naranjas
 * realizan el trabajo deseado. Adicionalmente, si cada naranja pesa en promedio 6
 * gramos. ¿Cuántas toneladas son necesarias?
 */

import java.util.Scanner;

public class Ejercicio42 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese cuantos kilovoltios son necesarios para el funcionamiento: ");
        double kilovoltios = scanner.nextDouble();

        double necesario = kilovoltios / 0.05;
        System.out.println("SOn necesarias " + necesario + " naranjas para suplir " + kilovoltios + " kilovoltios");
        double pesoToneladas = (necesario * 6) / 1000;
        System.out.println("El pesos de las naranjas en toneladas es: " + pesoToneladas);
    }
}
