/*
 * 14.Introducir un número por teclado supone que tiene cuatro dígitos, Desplegar la
 * suma de los dígitos.
 */

 import java.util.*;;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numeros[] = new int[4];

        System.out.print("Ingrese un número de cuatro dígitos: ");
        int n = read.nextInt();
       
        String numerosString = String.valueOf(n);
        for (int i = 0; i < numerosString.length(); i++) {
            char numeroString = numerosString.charAt(i);
            numeros[i] = Character.getNumericValue(numeroString);
            System.out.println(numeros[i]);            
        }
        System.out.println("El ultimo número ingresado fue: " + numeros[3]);
        System.out.println("La suma de todos los números es: " + (numeros[0] + numeros[1] + numeros[2] + numeros[3]));
        read.close();
    }
}
