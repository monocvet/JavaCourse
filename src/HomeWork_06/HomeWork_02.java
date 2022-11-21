package HomeWork_06;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        /**
         Ввести 5 строк с консоли, найти самую короткую и самую длинную строки.
         Вывести найденные строки и их длину.*/
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
       // int array = str.array();


        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите слово: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
    }
}
