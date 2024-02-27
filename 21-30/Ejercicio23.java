import java.util.*;

public class Ejercicio23 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int[] numeros = new int[3];
    static int[] numerosAdivinado = new int[3];
    static int nIntentos = 1;
    static boolean juegoTerminado = false;

    // Colores para la terminal
    public static final String GREEN = "\033[0;32m"; // Green
    public static final String YELLOW = "\033[0;33m"; // Yellow
    public static final String RESET = "\033[0m"; // Reset
    public static final String RED = "\033[0;31m"; // Red
    public static final String CYAN = "\033[0;36m"; // Cyan

    public static void main(String[] args) {
        option();
    }

    public static void option() {
        System.out.println(CYAN + "Hola, ¿quieres jugar el juego?");
        System.out.println("1. YEAH");
        System.out.println("2. NO");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                game();
                break;
            default:
                System.out.println("See you");
                break;
        }
    }

    // Juego
    public static void game() {
        // Se crean los números aleatorios y se piden
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
            // System.out.println(numeros[i]);
        }

        while (!juegoTerminado && nIntentos <= 4) {
            System.out.println("Intento número: " + nIntentos);
            for (int i = 0; i < numerosAdivinado.length; i++) {
                System.out.print(CYAN + "Ingrese el número que cree que va en la posición " + (i + 1) + " : ");
                numerosAdivinado[i] = scanner.nextInt();
            }
            validador();
            nIntentos++;
        }

        if (!juegoTerminado) {
            System.out.println(RED + "Perdiste...");
        }
    }

    // Validador 
    public static void validador() {
        boolean ganaste = true;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numerosAdivinado[i]) {
                System.out.println(GREEN + "Posición " + (i + 1) + ": Verde" + RESET);
            } else if (contiene(numeros, numerosAdivinado[i])) {
                System.out.println(YELLOW + "Posición " + (i + 1) + ": Amarillo" + RESET);
                ganaste = false;
            } else {
                System.out.println(RED + "Posición " + (i + 1) + ": Rojo" + RESET);
                ganaste = false;
            }
        }

        if (ganaste) {
            System.out.println(GREEN + "¡GANASTE EL JUEGO!" + RESET);
            juegoTerminado = true;
        }
    }

    public static boolean contiene(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
