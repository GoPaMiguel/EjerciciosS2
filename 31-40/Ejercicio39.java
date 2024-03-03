import java.util.Scanner;

public class Ejercicio39 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        System.out.print("Ingrese el año actual: ");
        int anioActual = scanner.nextInt();

        int aniosVividos = anioActual - anioNacimiento;
        double aniosDurmiendo = 0.34 * aniosVividos;
        int diasDurmiendo = (int) (aniosDurmiendo * 365);

        System.out.printf("La persona ha dormido aproximadamente %d días.%n", diasDurmiendo);
    }
}
