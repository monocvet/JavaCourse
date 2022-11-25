package HomeWork_06;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        /**
         Ввести 5 строк с консоли, найти самую короткую и самую длинную строки.
         Вывести найденные строки и их длину.*/
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        //  int[] count = new int[5];
        int a = 0;
        String s = "";
        String d = "";

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите строку: ");
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > a) {
                a = array[i].length();
                s = array[i];
            }else if (array[i].length() < a) {
                a = array[i].length();
                d = array[i];
            }
        }
        System.out.println("Самая длинная строка: " + s + " , длина: " + s.length());
        System.out.println("Самая короткая строка: " + d + " , длина: " + d.length());
    }
}

