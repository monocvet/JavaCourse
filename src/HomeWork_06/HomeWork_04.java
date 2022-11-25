package HomeWork_06;

import java.util.Scanner;

public class HomeWork_04 {
    public static void main(String[] args) {
        /**     4
         1. —оздать массив на 10 строк.
         2. —оздать массив на 10 чисел.
         3. ¬вести с клавиатуры 10 строк, заполнить ими массив строк.
         4. ¬ каждую €чейку массива чисел записать длину строки из массива строк, индекс/номер €чейки
         которой совпадает с текущим индексом из массива чисел.
         */
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int[] count = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("¬ведите слово: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
        for (int i = 0; i < count.length; i++) {
            count[i] = array[i].length();
            System.out.println(count[i]);

        }
    }
}
