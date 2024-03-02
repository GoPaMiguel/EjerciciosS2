/*
 * 27.Que el usuario de su género y su nombre, dependiendo de su género imprimir en
 * pantalla Bienvenido “nombre”, Bienvenida “nombre”, y si en dado caso se pone otra
 * opción imprimir en pantalla Hola indeciso .
 */

import java.util.Scanner;

public class Ejercicio27 {
    static int opcion;
    static String name;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        limpiarPantalla();        
        datos();
    }

    public static void datos() {
        System.out.println("Ingrese su género: ");
        System.out.println("1. Masculino");
        System.out.println("2. Femenino");
        System.out.println("3. otro");
        opcion = scanner.nextInt();
        limpiarPantalla();
        System.out.print("Ingrese su nombre: ");
        name = scanner.next();
        mensajes(opcion, name);
    }

    public static void mensajes(int genero, String name) {
        switch (genero) {

            case 1:
                System.out.println("Bienvenido " + name);
                break;
            case 2:
                System.out.println("Bienvenida " + name);
                break;
            default:
                System.out.println("Hola indeciso");
                break;
        }
    }

    public static void limpiarPantalla() {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
