import java.util.Scanner;

public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la calificación del examen de Matemáticas:");
        double calificacionExamenMatematicas = entrada.nextDouble();

        double sumaTareasMatematicas = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la calificación de la tarea " + i + " de Matemáticas:");
            sumaTareasMatematicas += entrada.nextDouble();
        }
        double promedioTareasMatematicas = sumaTareasMatematicas / 3;

    
        double calificacionMatematicas = 0.9 * calificacionExamenMatematicas + 0.1 * promedioTareasMatematicas;

    
        System.out.println("Ingrese la calificación del examen de Física:");
        double calificacionExamenFisica = entrada.nextDouble();

        double sumaTareasFisica = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese la calificación de la tarea " + i + " de Física:");
            sumaTareasFisica += entrada.nextDouble();
        }
        double promedioTareasFisica = sumaTareasFisica / 2;

    
        double calificacionFisica = 0.8 * calificacionExamenFisica + 0.2 * promedioTareasFisica;

    
        System.out.println("Ingrese la calificación del examen de Química:");
        double calificacionExamenQuimica = entrada.nextDouble();

        double sumaTareasQuimica = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la calificación de la tarea " + i + " de Química:");
            sumaTareasQuimica += entrada.nextDouble();
        }
        double promedioTareasQuimica = sumaTareasQuimica / 3;

    
        double calificacionQuimica = 0.85 * calificacionExamenQuimica + 0.15 * promedioTareasQuimica;

    
        double promedioGeneral = (calificacionMatematicas + calificacionFisica + calificacionQuimica) / 3;

    
        System.out.println("El promedio en Matemáticas es: " + calificacionMatematicas);
        System.out.println("El promedio en Física es: " + calificacionFisica);
        System.out.println("El promedio en Química es: " + calificacionQuimica);
        System.out.println("El promedio general en las tres materias es: " + promedioGeneral);

        entrada.close();
    }
}
