/*
 * 12.Introducir tres números por teclado, hallar el promedio de los tres números, la suma
 * y desplegar del primer número el doble, del segundo número el triple y del tercer
 * número el cuadrado.
 */

import java.util.*;;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Introducir el primer número: ");
        double n1 = read.nextDouble();
        System.out.print("Introducir el segundo número: ");
        double n2 = read.nextDouble();
        System.out.print("Introducir el tercer número: ");
        double n3 = read.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        double suma = n1 + n2 + n3;
        double doble =  n1 * 2;
        double triple =  n2 * 3;
        double cuadrado =  Math.pow(n3, 2);
        System.out.println("El promedio es: " + promedio );
        System.out.println("La suma es: " + suma );
        System.out.println("El doble del primer número es: " + doble );
        System.out.println("El triple del segundo número es: " + triple );
        System.out.println("El cuadrado del tercer número es: " + cuadrado );        
        read.close();
    }
}
