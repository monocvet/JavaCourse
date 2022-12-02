package lesson_05;

public class StringApplication {
    public static void main(String[] args) {
        String str = "Hello world!";
        String str1 = new String("Hello world");
        str1 += "!";

        System.out.println(str);
        System.out.println(str1);

        for (int i = 0; i < 10; i++) {
            str1 += "!";
        }
        System.out.println(str1);
/**
 * String !
 *
 *
 *          length() - возвращает длину строки
 *
 *          concat(): объединяет строки / +=
 *
 *          equals(): сравнивает строки с учетом регистра
 *
 *          equalsIgnoreCase(): сравнивает строки без учета регистра
 *
 *          startsWith(): определяет, начинается ли строка с подстроки
 *
 *          endsWith(): определяет, заканчивается ли строка на определенную подстроку
 *
 *          String replace(char oldChar, char newChar)
 *          Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.
 *
 *          String[] split(String regex)
 *          Разделяет эту строку, окружая данным регулярным выражением.
 *
 *          trim(): удаляет начальные и конечные пробелы
 *
 *          toLowerCase(): переводит все символы строки в нижний регистр
 *
 *          toUpperCase(): переводит все символы строки в верхний регистр*/
        int length = str1.length();
        System.out.println(length);

        String str2 = "hello world!";

        boolean equals = "Hello world!".equals(str);
        boolean equals1 = str.equalsIgnoreCase(str2);
        boolean hello = str2.startsWith("world");
        boolean length1 = str2.endsWith("world!");

        String str3 = str2.replace("world", "Russia");

        String letter = "hello my dear friend";
        String[] arr = letter.split(" ");


        System.out.println(equals);
        System.out.println(equals1);
        System.out.println(hello);
        System.out.println(length1);
        System.out.println(str3);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toUpperCase() + " ");

        }



    }
}
