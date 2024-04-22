import java.util.Scanner;

public class Ejercicio36 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de horas: ");
        double horas = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de minutos : ");
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

        // Calcular el costo
        double costo = tiempoTotalHoras * 15;

        return costo;
    }
}
