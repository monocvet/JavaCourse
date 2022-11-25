package HomeWork_06;

import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {
        /**       5
         1. Считать 6 строк и заполнить ими массив strings.
         2. Удалить повторяющиеся строки из массива strings,
         заменив их на null (null должны быть не строками "null").*/

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (s != null && s.equalsIgnoreCase(array[j])) {
                    array[i] = array[j] = null;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
