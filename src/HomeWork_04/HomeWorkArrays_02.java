package lesson_04.HomeWork_04;

import java.util.Scanner;

public class HomeWorkArrays_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("������� �����: ");
            int a = scanner.nextInt();
            array[i] = a;
        }
        int max = array[0];
        for (int i = 0; i < 10 ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        } System.out.println("������������ �����: " + max);
    }
}
