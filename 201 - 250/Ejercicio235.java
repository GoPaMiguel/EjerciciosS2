import java.util.Scanner;

public class Ejercicio235 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nums[];

        System.out.print("Digite la cantidad de números fibonacci a mostrar: ");
        nums = new int[entrada.nextInt()];

        if (nums.length == 1) {
            System.out.println(0);
        }else if (nums.length == 2) {
            System.out.println(0);
            System.out.println(1);
        } else {
            nums[0] = 0;
            nums[1] = 1;

            for (int i = 2; i < nums.length; i++) {
                nums[i] = nums[(i - 1)] + nums[(i - 2)];
            }

            for (int num : nums) {
                System.out.println(num);
            }
        }
        entrada.close();
    }
}