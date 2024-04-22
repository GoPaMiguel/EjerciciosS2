import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio224 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno alumno = new Alumno();

        do {
            System.out.print("Nombre del estudiante: ");
            alumno.nombre = entrada.nextLine();

            if (alumno.nombre.isEmpty()) {
                break;
            }

            System.out.print("Digite la nota practica: ");
            alumno.nota1 = entrada.nextFloat();

            if (alumno.nota1 < 0 || alumno.nota1 > 10) {
                System.out.println("Error: valor no válido.");
            }else{
                System.out.print("Digite la nota de problemas: ");
                alumno.nota2 = entrada.nextFloat();

                if (alumno.nota2 < 0 || alumno.nota2 > 10) {
                    System.out.println("Error: valor no válido.");
                }else{
                    System.out.print("Digite la nota teórica: ");
                    alumno.nota3 = entrada.nextFloat();

                    if (alumno.nota3 < 0 || alumno.nota3 > 10) {
                        System.out.println("Error: valor no válido.");
                    }else{
                        System.out.println("Alumno: " + alumno.nombre);
                        System.out.println("Definitiva: " + ((alumno.nota1 * 0.1) + (alumno.nota2 * 0.5) + (alumno.nota1 * 0.4)));
                    }
                }            
            }
        } while (true);
        entrada.close();
    }

    private static class Alumno{
        static String nombre;
        static float nota1;
        static float nota2;
        static float nota3;
    }
}
