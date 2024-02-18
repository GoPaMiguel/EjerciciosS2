/*
 * 20.Introducir 5 notas por teclado, obtener la suma de las notas, el promedio de las
 * mismas y el doble de las notas.
 */

 import java.util.*;

public class Ejercicio20 {
    static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        double notas[] = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1 ));
            notas[i] = read.nextDouble();
            
        }
        double suma = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        double promedio = suma / 5;
        double doble = suma * 2;
        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("El doble de las notas es: " + doble);

        read.close();
    }
}