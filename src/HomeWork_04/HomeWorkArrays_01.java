package HomeWork_04;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkArrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            System.out.print("Введите слово: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
        for (int c = 9; c >= 0; c--) {
            System.out.println("Ячейка №:" + (c + 1) + " Значение: " + array[c] + ";");
        }

    }
}
