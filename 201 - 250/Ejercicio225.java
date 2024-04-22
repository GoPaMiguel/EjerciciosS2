import java.util.Scanner;

public class Ejercicio225 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite un número par: ");
        num = entrada.nextInt();

        if (num%2 != 0) {
            System.out.println("Error: Valor no válido.");
        }

        for (int i = 0; i < (num/2); i++) {
            for (int j = 0; j < (num/2); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
