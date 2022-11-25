package HomeWork_09;

import java.util.ArrayList;

public class HomeWork_09_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Привет, мир!");
        list.add("Ты не такой как все.");
        list.add("У тебя океан внутри.");
        list.add("За одну ночь нельзя изменить жизнь.");
        list.add("Не стоит принимать доброту за слабость.");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Размер коллекции: " + list.size());
    }
}
