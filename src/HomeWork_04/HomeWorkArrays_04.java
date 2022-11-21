package HomeWork_04;

import java.util.Scanner;

public class HomeWorkArrays_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("¬ведите число: ");
            int a = scanner.nextInt();
            array[i] = a;
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
