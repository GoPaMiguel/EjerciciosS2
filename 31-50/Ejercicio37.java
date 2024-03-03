import java.util.Scanner;

public class Ejercicio37 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        double horas = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de minutos trabajados: ");
        double minutos = scanner.nextDouble();

        double costoEstacionamiento = calcularCostoEstacionamiento(horas, minutos);

        if (costoEstacionamiento > 0) {
            System.out.printf("El cliente debe pagar $%.2f por el estacionamiento.%n", costoEstacionamiento);
        } else {
            System.out.println("No hay costo para esta cantidad de tiempo de estacionamiento.");
        }
    }

    public static double calcularCostoEstacionamiento(double horas, double minutos) {
        // Convertir minutos a horas
        double tiempoTotalHoras = horas + minutos / 60;

        // Si el tiempo total es menor o igual a 1 hora, no hay costo adicional
        if (tiempoTotalHoras <= 1) {
            return 0;
        }
        // Si el tiempo total es mayor a 1 hora y los minutos no exceden 10, se cobra solo 1 hora
        else if (tiempoTotalHoras > 1 && minutos <= 10) {
            return 15;
        }
        // De lo contrario, se cobra la siguiente hora completa
        else {
            return 15 * Math.ceil(tiempoTotalHoras);
        }
    }
}
