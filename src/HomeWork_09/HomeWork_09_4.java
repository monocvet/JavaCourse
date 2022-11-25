package HomeWork_09;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_09_4 {
    public static void main(String[] args) {
        /**  4
         1. Создай список строк в методе main.
         2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
         3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите предложение: ");
            list.add(0, scanner.nextLine());
        }
        for (String a: list) {
            System.out.println(a);
        }
    }
}
