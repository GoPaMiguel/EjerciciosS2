import java.util.Scanner;

public class Ejercicio40 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de kilos de oro: ");
        double kilosOro = scanner.nextDouble();
        System.out.print("Ingrese el precio en pesos por onza de oro: ");
        double precioOnzaOro = scanner.nextDouble();

        double gramosOro = kilosOro * 1000;
        double onzasOro = gramosOro / 28.3495;
        double valorEnPesos = onzasOro * precioOnzaOro;

        System.out.printf("%.2f kilos de oro equivalen a %.2f pesos.%n", kilosOro, valorEnPesos);
    }
}
