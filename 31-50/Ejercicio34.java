
/*
34.Dado el monto de una compra calcular el descuento considerado -descuento es
10% si el monto es mayor a 1000 pesos -descuento es 20% si el monto es mayor a
500 pesos y menor o igual a 1000 pesos -no hay descuento si el monto es mayor o
igual a 500 pesos .
*/
import java.util.Scanner;

public class Ejercicio34 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el monto de la compra en pesos: ");
        double montoCompra = scanner.nextDouble();

        double descuento = calcularDescuento(montoCompra);

        if (descuento > 0) {
            System.out.printf("El descuento para un monto de compra de %.2f pesos es de %.2f pesos.%n", montoCompra,
                    descuento);
        } else {
            System.out.println("No hay descuento para este monto de compra.");
        }
    }

    public static double calcularDescuento(double monto) {
        if (monto > 1000) {
            return 0.10 * monto;
        } else if (monto > 500 && monto <= 1000) {
            return 0.20 * monto;
        } else {
            return 0;
        }
    }
}
