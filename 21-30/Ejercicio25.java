/*
 * 25.Programa que de acuerdo a una cantidad de grados centígrados ingresadas por
 * teclado, realice la conversión a grados fahrenheit. (Multiplica por 9, divide entre 5,
 * después suma 32).
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("conversión de grados centígrados a fahrenheit");
        System.out.print("Ingrese los grados centígrados: ");
        double centígrados = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(centígrados);
        System.out.println(centígrados + " celsius a fahrenheit son: " + fahrenheit);
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    
}
