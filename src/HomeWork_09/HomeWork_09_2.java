package HomeWork_09;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.Scanner;

public class HomeWork_09_2 {
    public static void main(String[] args) {
        /**   2
         1. Создай список строк.
         2. Считай с клавиатуры 5 строк и добавь в список.
         3. Используя цикл, найди самую длинную строку в списке.
         4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.*/

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите предложение: ");
            list.add(scanner.nextLine());
        }
        int a = list.get(0).length();
        for (String b: list) {
            if (b.length() > a)
                a = b.length();
        }

        for (String b: list) {
            if (b.length() == a)
                System.out.println(b);
        }
    }
}
