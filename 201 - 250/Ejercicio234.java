import java.util.Scanner;

public class Ejercicio234 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String num, num2 = "", num3 = "";
        char n1, n2;

        System.out.print("Digite un número: ");
        num = entrada.next();

        char numChar[] = new char[num.length()];

        for (int i = 0; i < num.length(); i++) {
            numChar[i] = num.charAt(i);
        }

        for (int i = num.length(); i > 0; i--) {
            num2 += num2.valueOf(numChar[(i - 1)]);
        }

        if (num2.equals(num)) {
            System.out.println("El número es capicúo.");
            System.out.println(num2);
        } else {
            System.out.println("El número no es capicúo.");
            System.out.println(num2);
        }
        entrada.close();
    }
}
