package HomeWork_09;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_09_6 {
    public static void main(String[] args) {
        /** 6
         1. Создай список строк.
         2. Добавь в него 10 строчек с клавиатуры.
         3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
         Если таких строк несколько, то должны быть учтены самые первые из них.
         4. Выведи на экран строку из пункта 3. Должна быть выведена одна строка.
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            int a = 0;
            int b = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).length() >= list.get(j).length()) {
                    a++;
                }
                if (list.get(i).length() <= list.get(j).length()) {
                    b++;
                }
                if (a == 5 || b == 5) {
                    System.out.println(list.get(i));
                }
            }

        }
    }
}
