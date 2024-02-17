/*
 * 10.Hallar el área de un triángulo
 */

 import java.util.*;;

public class Ejercicio10 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Programa que halla el área de un triángulo usando la Fórmula de Herón...");
        System.out.print("Ingrese el valor del lado 'a' del triángulo: ");
        double a = read.nextDouble();
        System.out.print("Ingrese el valor del lado 'b' del triángulo: ");
        double b = read.nextDouble();
        System.out.print("Ingrese el valor del lado 'c' del triángulo: ");
        double c = read.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);

    }
}
