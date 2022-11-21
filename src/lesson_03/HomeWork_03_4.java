package lesson_03;

import java.util.Scanner;

public class HomeWork_03_4 {
    public static void main(String[] args) {
        /** Задача 4 */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else if (number == 0) {
            System.out.println("0");
        }
    }
}
