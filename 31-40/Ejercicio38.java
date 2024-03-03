import java.util.Scanner;

public class Ejercicio38 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        double frutaConsumidaGramos = calcularFrutaConsumida(edad);
        int manzanasConsumidas = calcularManzanasConsumidas(frutaConsumidaGramos);

        System.out.printf("La persona ha consumido %.2f gramos de fruta.%n", frutaConsumidaGramos);
        System.out.printf("Esto es aproximadamente equivalente a %d manzanas.%n", manzanasConsumidas);
    }

    public static double calcularFrutaConsumida(int edad) {
        // Cada año de vida corresponde a 8 kg de fruta
        double frutaKg = edad * 8;
        // Convertir kg a gramos
        return frutaKg * 1000;
    }

    public static int calcularManzanasConsumidas(double frutaGramos) {
        // Suponiendo que una manzana pesa en promedio 4 gramos
        return (int) (frutaGramos / 4);
    }
}
