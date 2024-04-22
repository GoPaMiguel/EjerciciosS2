import java.util.Scanner;

public class Ejercicio226 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite un número: ");
        num = entrada.nextInt();

        entrada.close();

        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
