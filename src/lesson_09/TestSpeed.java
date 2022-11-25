package lesson_09;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestSpeed {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Добавление а Array  " + (end - start));


//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i + 10);
//        }
        LinkedList<Integer> linkedList = new LinkedList<>();



        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);
        }

        System.out.println("Добавление в Link " + (end - start));

//        int a = 10;
//        while (a > 0) {
//            System.out.println("Обратный отсчет. Осталось " + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            a--;
//        }
        
        System.out.println();
    }
}
