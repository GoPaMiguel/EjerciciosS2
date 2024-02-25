/*
 * 19.Introducir el sueldo básico de un empleado por teclado, hallar el total ganado
 * considerando que debe introducir el monto por horas extras, considerar un
 * descuento del 20%. Desplegar el sueldo básico, el total del descuento y el total
 * ganado. 
 */

 import java.util.*;;
public class Ejercicio19 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Ingrese el sueldo básico del empleado:  $"); 
       double sueldoBasico = read.nextDouble();
       System.out.print("Ingrese el número de horas extras que trabajo: "); 
       int horasExtras = read.nextInt();
       System.out.print("Ingrese el valor de cada hora extra:  $"); 
       double valorHoraExtra = read.nextDouble();

       double sueldo = sueldoBasico + (horasExtras * valorHoraExtra);
       double sueldoTotal = sueldo - (sueldo * .20);
       System.out.println("El sueldo básico más horas extras es: $" + sueldo);
       System.out.println("El descuento del 20% aplicado al sueldo es:  $" + (sueldo * .20));
       System.out.println("El sueldo total luego de aplicar el descuento es: $" + sueldoTotal  );


    }
}
