import java.util.Scanner;

public class Ejercicio220 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        int numero;
        do {
            System.out.println("Ingrese un número (o -1 para terminar):");
            numero = entrada.nextInt();

            if (numero != -1 && numero >= 0) {
                suma += numero;
                contador++;
            } else if (numero < 0) {
                System.out.println("No se permiten números negativos. Por favor, ingrese un número válido.");
            }
        } while (numero != -1);


        double media = 0;
        if (contador > 0) {
            media = (double) suma / contador;
        }


        System.out.println("La media aritmética de los números ingresados es: " + media);

        entrada.close();
    }
}