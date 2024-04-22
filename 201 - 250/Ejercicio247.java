import java.util.Scanner;

public class Ejercicio247 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Digite un número: ");
        n = entrada.nextInt();

        System.out.print(n + "= 0");

        for (int i = 1; sum < (n * n); i+=2) {
            if (sum + i > n * n) {
                i = 1;
            }
            sum += i;
            System.out.print(" + " + i);
        }

        System.out.println("= " + sum);

        entrada.close();
    }
}
