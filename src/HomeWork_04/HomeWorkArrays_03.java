package HomeWork_04;

import java.util.Scanner;

public class HomeWorkArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array2 = new String[10];
        int[] array3 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("¬ведите слово: ");
            String a = scanner.nextLine();
            array2[i] = a;
        }
        for (int i = 0; i < 10; i++) {
            String b = array2[i];
            int length = b.length();
            System.out.println(array3[i] + " " + length);
        }
    }
}
