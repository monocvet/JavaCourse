package lesson_03;

import java.util.Scanner;

public class Homework_03_3 {
    public static void main(String[] args) {
        /** Задача 3 */
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int x = 365;
        //int x1 = 366;

        if (year % 400 == 0) {
            System.out.println("Количество дней в этом году:" + (++x));
        } else if ((year % 100 == 0) && (year % 400 != 0)) {
            System.out.println( "Количество дней в этом году:" + x);
        } else if ((year % 4 == 0)) {
            System.out.println("Количество дней в этом году:" + (++x));
        } else {
            System.out.println("Количество дней в этом году:" + x);
        }
    }
}

