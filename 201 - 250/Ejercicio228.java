import java.util.Scanner;

public class Ejercicio228 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigo, clave;

        do {
            System.out.print("\nDigite el código: ");
            codigo = entrada.next();

            System.out.print("Digite la contraseña: ");
            clave = entrada.next();
        } while (!codigo.equals("1") || !clave.equals("1234"));

        entrada.close();
    }
}
