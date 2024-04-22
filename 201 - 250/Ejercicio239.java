import java.util.Scanner;

public class Ejercicio239 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Digite un número: ");
            num = entrada.nextInt();

            sum += num;
        
        } while (num != 999);

        sum -= 999;

        System.out.println("La suma de los números es: " + sum);

        entrada.close();
    }
}
