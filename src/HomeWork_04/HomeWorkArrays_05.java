package HomeWork_04;

import java.util.Scanner;

public class HomeWorkArrays_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 20; i++) {
            System.out.print("¬ведите число: ");
            int a = scanner.nextInt();
            array[i] = a;
        }
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i+10];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
}
