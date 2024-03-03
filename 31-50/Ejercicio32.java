import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar las dimensiones del rectángulo en metros
        System.out.print("Ingresa la longitud del rectángulo (en metros): ");
        double longitudMetros = scanner.nextDouble();

        System.out.print("Ingresa el ancho del rectángulo (en metros): ");
        double anchoMetros = scanner.nextDouble();

        // Calcular el área en metros cuadrados
        double areaMetros = longitudMetros * anchoMetros;

        // Convertir el área a centímetros cuadrados y milímetros cuadrados
        double areaCm = areaMetros * 10000;
        double areaMm = areaMetros * 1000000;

        // Mostrar los resultados
        System.out.println("Área del rectángulo: " + areaMetros + " metros cuadrados");
        System.out.println("Área del rectángulo: " + areaCm + " centímetros cuadrados");
        System.out.println("Área del rectángulo: " + areaMm + " milímetros cuadrados");
        scanner.close();
    }
}
