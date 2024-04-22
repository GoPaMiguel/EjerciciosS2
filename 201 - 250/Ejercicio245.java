import java.util.Scanner;

public class Ejercicio245 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Digite un número: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2); 
        }

        System.out.println("La suma de los " + n + " primeros números primos es: " + sum);

        entrada.close();
    }
}
