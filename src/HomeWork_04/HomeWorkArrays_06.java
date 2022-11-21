package HomeWork_04;

import java.util.Scanner;

public class HomeWorkArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Введите число: ");
            int a = scanner.nextInt();
            array[i] = a;
        }
        int max = array[0];
        for (int i = 0; i < 20; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
            int min = array[0];
            for (int i = 0; i < 20; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println("Максимальное число: " + max + " " + "Минимальное число: " + min);
        }
    }

