/*
 * 9. Programa que obtenga el IVA sobre una cantidad dada por el usuario.
 */

 import java.util.*;;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Obten el IVA sobre una cantidad ingresada");
        System.out.print("Ingrese el valor: ");
        double cantidad = read.nextDouble();
        double IVA =.19;
        double total = (cantidad * IVA) + cantidad;
        System.out.println("El total incluyendo el IVA es de: " + total);
        read.close();

        
    }
}
