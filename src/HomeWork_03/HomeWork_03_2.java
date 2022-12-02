package lesson_03;

import java.util.Scanner;

public class HomeWork_03_2 {
    public static void main(String[] args) {
        /** Задача 2 */
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextInt();

        if (t % 5 < 3) {
            System.out.println("Зеленый");
        } else if (t % 5 >= 3 && t % 5 < 4) {
            System.out.println("Желтый");
        } else if (t % 5 >= 4 && t % 5 < 5) {
            System.out.println("Красный");
        }
    }
}

