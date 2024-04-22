import java.util.Scanner;

public class Ejercicio251 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, cont = 0;

        do {
            System.out.print("Digite un número: ");
            n = entrada.nextInt();

            if (n > 5) {
                cont++;
            }
        } while (n > 5);

        System.out.println("\nNúmero: " + n);
        System.out.println("Intentos fallidos: " + cont);

        entrada.close();
    }
}
