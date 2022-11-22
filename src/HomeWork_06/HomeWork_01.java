package HomeWork_06;

import java.util.Scanner;

public class HomeWork_01 {
    public static void main(String[] args) {
        /**
         Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

         Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
         Программа выводит слова на экран.*/

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[100];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите слово: ");
            String a = scanner.nextLine();
            array[i] = a;
            if (a.isEmpty()) {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toUpperCase());
            if (array[i].isEmpty()) {
                break;
            }
        }

            for (int i = 0; i < array.length; i++) {
                if (array[i].length() % 2 == 0) {
                    System.out.println(array[i] + " " + array[i]);
                } else {
                    System.out.println(array[i] + " " + array[i] + " " + array[i]);
                }
            }
        }
    }




