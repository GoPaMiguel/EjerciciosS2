/*
 * 26.Realizar el diagrama de flujo para que nos calcule el cuadrado de la hipotenusa de
 * un triángulo rectángulo, a partir de la longitud de sus dos catetos.
 */

 import java.util.Scanner;

 public class Ejercicio26 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Ingresa la longitud del primer cateto (a): ");
         double catetoA = scanner.nextDouble();
 
         System.out.print("Ingresa la longitud del segundo cateto (b): ");
         double catetoB = scanner.nextDouble();
 
         double cateto1Cuadrado = Math.pow(catetoA, 2);
         double cateto2Cuadrado = Math.pow(catetoB, 2);
 
         double hipotenusaCuadrado = cateto1Cuadrado + cateto2Cuadrado;
 
         System.out.printf("El cuadrado de la hipotenusa es: %.2f%n", hipotenusaCuadrado);
         scanner.close();
     }
 }
 
