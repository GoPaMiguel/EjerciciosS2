import java.util.Scanner;

public class Ejercicio250 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n2[] = new double[5], sum = 0, n, a;

        System.out.print("Digite la cantidad de alumnos: ");
        a = entrada.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("Digite la nota del alumno #" + i + ": ");
            n = entrada.nextDouble();

            if (n > sum || i == 1) {
                sum = n;
            }
        }

        System.out.println("\nNota más alta: " + sum);

        entrada.close();
    }
}