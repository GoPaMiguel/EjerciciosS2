import java.util.Scanner;

public class Ejercicio219 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de N:");
        int N = entrada.nextInt();

        int suma = 0;

        for (int i = 1; i <= N; i++) {
            int numeroPar = 2 * i;
            suma += numeroPar;
        }

        System.out.println("La suma de los " + N + " primeros números pares es: " + suma);

        entrada.close();
    }
}
