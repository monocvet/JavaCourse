package lesson_04.HomeWork_04;

import java.util.Scanner;

public class HomeWorkArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("������� �����: ");
            int a = scanner.nextInt();
            array[i] = a;
        }
        int i ;
        int a ;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (i = 0; i < 19; i++) {
                if (array[i] < array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    flag = true;
                }
            }
        }
        for (int c = 0; c < 20; c++) {
            System.out.print(array[c] + " ");
        }
    }
}
