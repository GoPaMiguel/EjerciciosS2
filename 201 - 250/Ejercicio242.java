public class Ejercicio242 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= 60; i+=3) {
            if (i > 21 || i < 30) {
                sum += i; 
            }
        }

        System.out.println(sum);
    }
}
