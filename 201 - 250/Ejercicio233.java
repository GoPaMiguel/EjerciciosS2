import java.util.Scanner;

public class Ejercicio233 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[];

        System.out.print("Digite la cantidad de números a ingresar: ");
        num = new int[entrada.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite un número ("+(i + 1) + "/" + num.length + "): ");
            num[i] = entrada.nextInt();

            if (num[i] < 0) {
                num[i] = num[i] * -1;
            }
        }

        for (int i : num) {
            System.out.println(i);
        }
        entrada.close();
    }
}
