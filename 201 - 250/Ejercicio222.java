import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio222 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList nums = new ArrayList<>();
        int num, menor, mayor;
        float media = 0;

        System.out.print("Digite un número: ");
        num = entrada.nextInt();

        menor = num;
        mayor = num;

        while (num != 0){
            if (num > mayor) {
                mayor = num;
            } else if(num < menor) {
                menor = num;
            }

            nums.add(num);

            System.out.print("Digite un número: ");
            num = entrada.nextInt();
        }

        for (Object numero : nums) {
            media += (int) numero;
        }

        entrada.close();

        media /= nums.size();

        System.out.println("Estadísticas: ");
        System.out.println("Número máximo: " + mayor);
        System.out.println("Número mínimo: " + menor);
        System.out.println("Media: " + media);
    }
}
