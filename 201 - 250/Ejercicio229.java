import java.util.Scanner;

public class Ejercicio229 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        do {
            System.out.print("Digite el primer número par: ");
            n1 = entrada.nextInt();

            System.out.print("Digite el segundo número par: ");
            n2 = entrada.nextInt();

            if (n1%2 == 0 && n2%2 == 0) {
                System.out.println("La suma de los números es: " + (n1 + n2));
            }else{
                System.out.println("Error: uno de los números introducidos no es par.");
            }
        } while (n1 != 0 && n2 != 0);
        entrada.close();
    }
}
