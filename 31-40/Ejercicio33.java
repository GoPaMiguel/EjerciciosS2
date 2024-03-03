
/*
 * 33.Una empresa almacena los datos de N empleados, para esto, en un proceso
 * repetitivo se ingresa el sexo y el salario de cada empleado. Se pide
 * calcular:
 * a) La cantidad de personas que ganan más de 700 al mes.
 * b) El promedio de salarios.
 * c) El porcentaje de mujeres que trabajan en esa empresa
 * d) El porcentaje de varones que trabajan en esa empresa 
 */

 import java.util.Scanner;

public class Ejercicio33 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Initialize variables
        int totalEmployees = 0;
        double totalSalaries = 0;
        int femaleCount = 0;
        int maleCount = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el género (F/M) del empleado " + i + ": ");
            char gender = scanner.next().charAt(0);

            System.out.print("Ingrese el salario del empleado " + i + ": ");
            double salary = scanner.nextDouble();

            totalEmployees++;
            totalSalaries += salary;

            if (gender == 'F' || gender == 'f') {
                femaleCount++;
            } else if (gender == 'M' || gender == 'm') {
                maleCount++;
            }
        }

        // Calculate average salary
        double averageSalary = totalSalaries / totalEmployees;

        // Calculate percentages
        double femalePercentage = (femaleCount * 100.0) / totalEmployees;
        double malePercentage = (maleCount * 100.0) / totalEmployees;

        System.out.println("Cantidad de personas que ganan más de 700 al mes: " + countHighEarners(totalSalaries, n));
        System.out.println("Promedio de salarios: " + averageSalary);
        System.out.println("Porcentaje de mujeres: " + femalePercentage + "%");
        System.out.println("Porcentaje de varones: " + malePercentage + "%");
    }

    public static int countHighEarners(double totalSalaries, int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el salario del empleado " + i + ": ");
            double salary = scanner.nextDouble();
            if (salary > 700) {
                count++;
            }
        }
        return count;
    }
}


