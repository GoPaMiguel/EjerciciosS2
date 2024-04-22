public class Ejercicio223 {

    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0;

        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0) {
                cont1++;
            }
            if (i%3 == 0) {
                cont2++;
            }
        }

        System.out.println("Múltiplos de 2: " + cont1);
        System.out.println("Múltiplos de 3: " + cont2);
    }
}
