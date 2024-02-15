/* 
3. Programa que obtenga el área de un triángulo, a partir de datos proporcionados por
   el usuario.
   ● Ingresar la base y la altura
   ● Escribir la fórmula para el área
   ○ area = (base \* altura) / 2
   ● mostrar el resultado del área
*/

import java.util.*;

public class Ejercicio3 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Ingresa la base del triángulo: ");
        float base = read.nextFloat();
        System.out.print("Ingresa la altura del triángulo: ");
        float altura = read.nextFloat();

        float area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        
    }
}
