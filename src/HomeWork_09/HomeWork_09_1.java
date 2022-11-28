package HomeWork_09;

import java.util.ArrayList;

public class HomeWork_09_1 {
    public static void main(String[] args) {
/**  1
 1. Создай список строк.
 2. Добавь в него 5 различных строк.
 3. Выведи его размер на экран.
 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
        ArrayList<String> list = new ArrayList<>();

        list.add("Привет, мир!");
        list.add("Ты не такой как все.");
        list.add("У тебя океан внутри.");
        list.add("За одну ночь нельзя изменить жизнь.");
        list.add("Не стоит принимать доброту за слабость.");

        System.out.println("Размер коллекции: " + list.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
