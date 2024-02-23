/*
 * 13.Introducir tres números por teclado mostrar los últimos dígitos de cada número.
 */

import java.util.*;;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n[] = new int[3];
        String s[] = new String[3];
        System.out.println("Ingrese el primer número");
        n[0] = read.nextInt();
        System.out.println("Ingrese el segundo número");
        n[1] = read.nextInt();
        System.out.println("Ingrese el tercer número");
        n[2] = read.nextInt();

        for (int i = 0; i < 3; i++) {
            s[i] = String.valueOf(n[i]);
            String numero = s[i];
            int cuenta = numero.length();
            System.out.println( "El ultimo numero ingresado de " + n[i] + " es: " +  s[i].charAt(cuenta - 1));
        }

        // String nn = String.valueOf(n[0]);
        // System.out.println(nn.charAt(3));
        read.close();

    }
}
