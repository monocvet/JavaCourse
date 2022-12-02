package lesson_04.HomeWork_04;

import java.util.Scanner;

public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �����: ");
        int number = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num != -1) number += num;
            else if (num == -1) {
                System.out.println(number + -1);
                break;
            }

        }

    }
}
