/*
* 2. Programa que pida al usuario que ingrese un texto e imprima el mensaje “El texto
*  ingresado es :” junto al texto ingresado
*/

import java.util.*;

public class Ejercicio2 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Por favor ingrese un texto: ");
        String text = read.nextLine();
        System.out.println("El texto que ingreso anteriormente fue: " + text);
    }
}
