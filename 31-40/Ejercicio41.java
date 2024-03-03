import java.util.Scanner;

public class Ejercicio41 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        double crecimientoMensual = 0.5; // en centímetros
        double crecimientoAnual = crecimientoMensual * 12; // en centímetros
        double longitudCabello = crecimientoAnual * edad / 100; // en metros

        System.out.printf("La cabellera de la persona mide aproximadamente %.2f metros.%n", longitudCabello);
    }
}
