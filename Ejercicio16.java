/*
 * 16.Algoritmo que determine si una persona gano o no un examen matemático
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese la nota obtenida en el examen de matemáticas en la escala del 1-5: ");
        double nota = read.nextDouble();
        
        if (nota >= 3) {
            System.out.println("Felicitaciones GANASTE EL EXAME!");
        }else{
            System.out.println("Malas Noticias, perdiste el examen...");
            System.out.println("Recuerda que el examen se gana con 3 o superior");
        }
        read.close();
    }
}
