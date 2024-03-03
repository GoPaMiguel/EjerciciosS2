import java.util.Scanner;

public class Ejercicio35 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salario = calcularSalario(horasTrabajadas, tarifaPorHora);

        if (salario > 0) {
            System.out.printf("El salario del profesor es de %.2f pesos.%n", salario);
        } else {
            System.out.println("No hay salario para esta cantidad de horas trabajadas.");
        }
    }

    public static double calcularSalario(double horas, double tarifa) {
        double salarioBase = horas * tarifa;
        double horasExtras = Math.max(0, horas - 40);
        double tarifaHorasExtras = tarifa * 1.5;
        double salarioHorasExtras = horasExtras * tarifaHorasExtras;

        return salarioBase + salarioHorasExtras;
    }
}
