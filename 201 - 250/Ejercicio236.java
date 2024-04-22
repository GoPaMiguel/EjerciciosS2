import java.util.Scanner;

public class Ejercicio236 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite el número menor: ");
        n1 = entrada.nextInt();

        System.out.print("Digite el número mayor: ");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("Error: valor no válido.");
        }else{
            System.out.println("Números pares:");

            for (int i = n1; i <= n2; i++) {
                if (i%2 == 0) {
                    System.out.println(i);
                }
            }
        }
        entrada.close();
    }
}
