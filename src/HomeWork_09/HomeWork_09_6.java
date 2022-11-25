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
        int max = list.get(0).length();
        int min = list.get(0).length();
        int minlength = 0;
        int maxlength = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Введите строку: ");
            list.add(scanner.nextLine());
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxlength = i;
            }else if (list.get(i).length() < max) {
                min = list.get(i).length();
                minlength = i;
            }
        }
        if (minlength >= maxlength)
            System.out.println(list.get(maxlength));
        else
            System.out.println(list.get(minlength));

    }
}
