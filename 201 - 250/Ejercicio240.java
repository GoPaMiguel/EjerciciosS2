import java.util.Scanner;

public class Ejercicio240 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, sum = 0;

        System.out.print("Digite el multiplicando: ");
        n1 = entrada.nextInt();

        System.out.print("Digite el multiplicador: ");
        n2 = entrada.nextInt();

        System.out.print("\n" + n1 + " * " + n2 + " = (");

        for (int i = 1; i < n2; i++) {
            System.out.print(n1 + " + ");

            sum += n1;
        }
        sum += n1;
        System.out.println(n1 + ") = " + sum);

        entrada.close();
    }
}
