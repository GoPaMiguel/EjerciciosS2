import java.util.Scanner;

public class Ejercicio246 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, nums[];

        System.out.print("Digite un número: ");
        n = entrada.nextInt();

        nums = new int[n];
        nums[0] = 10;
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[(i - 1)] + 11;
        }

        for (int num : nums) {
            System.out.println(num);
        }
        
        entrada.close();
    }
}
