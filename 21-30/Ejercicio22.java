/*
 * 22.Introducir un número real, mostrar la parte entera y la parte decimal del número.
 */

 import java.util.Scanner;

 public class Ejercicio22 {
     public static void main(String[] args) {
         double numero;
         Scanner read = new Scanner(System.in);
         String numeroString;
 
         System.out.print("Ingrese un número real: ");
         numero = read.nextDouble();
 
         numeroString = String.valueOf(numero);
         String[] nSeparado = numeroString.split("\\.");
         System.out.println("Parte entera :" + nSeparado[0]);
         System.out.println("Parte decimal :" + nSeparado[1]);
 
         read.close();
     }
 }