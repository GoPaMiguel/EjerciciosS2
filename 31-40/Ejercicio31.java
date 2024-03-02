/*
 * 31.Construir un programa que permita calcular el área de un triángulo. El usuario
 * ingresará la base y la altura en milímetros y el sistema mostrará los resultados en
 * milímetros, centímetros y metros cuadrados respectivamente.
 */

 import java.util.Scanner;

 public class Ejercicio31 {
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         System.out.println("área de un triángulo...");
         System.out.print("Ingrese la base en milímetros: ");
         float base = read.nextFloat();
         System.out.print("Ingrese la altura en milímetros: ");
         float altura = read.nextFloat();
         float areaMilimetros = (base * altura) / 2;
         System.out.println("El área del triángulo en milímetros es: " + areaMilimetros);
         System.out.println("El área del triángulo en centímetros es: " + (areaMilimetros / 10));
         System.out.println("El área del triángulo en metros es: " + (areaMilimetros / 1000));
 
         read.close();
     }
 }
 