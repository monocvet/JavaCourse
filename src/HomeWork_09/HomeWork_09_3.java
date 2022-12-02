package HomeWork_09;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_09_3 {
    public static void main(String[] args) {
/**  3
 1. Создай список строк.
 2. Считай с клавиатуры 5 строк и добавь в список.
 3. Используя цикл, найди самую короткую строку в списке.
 4. Выведи найденную строку на экран.
 5. Если таких строк несколько, выведи каждую с новой строки.*/

        ArrayList<String> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите предложение: ");
            list1.add(scanner.nextLine());
        }
        int a = list1.get(0).length();
        for (String b: list1) {
            if (b.length() < a)
                a = b.length();
        }

        for (String b: list1) {
            if (b.length() == a)
                System.out.println(b);
        }
    }
}
