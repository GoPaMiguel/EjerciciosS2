import java.util.Scanner;

public class Ejercicio230 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        do {
            System.out.print("Digite el primer número: ");
            n1 = entrada.nextDouble();

            System.out.print("Digite el segundo número: ");
            n2 = entrada.nextDouble();

            if ((n1 > 0 && n2 > 0) && (n1 > n2)) {
                System.out.println("División: " + (n1 / n2));
                break;
            }else{
                System.out.println("Los datos ingresados no cumplen las condiciones necesarias.\n");
            }
        } while (true);
        entrada.close();
    }
}