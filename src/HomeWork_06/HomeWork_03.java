package HomeWork_06;

import java.util.Scanner;

public class HomeWork_03 {
    public static void main(String[] args) {
        /**   3
         1. Создать массив на 10 строк.
         2. Ввести с клавиатуры 8 строк и сохранить их в массив.
         3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
         * */
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];

        for (int i = 0; i <= 7; i++) {
            System.out.print("Введите слово: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
