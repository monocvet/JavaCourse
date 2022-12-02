package HomeWork_09;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class HomeWork_09_7 {
    public static void main(String[] args) {
        /**   7
         1. ¬веди с клавиатуры 20 чисел, cохрани их в список и рассортируй по трЄм другим спискам:
         „исло нацело делитс€ на 3 (x%3==0), нацело делитс€ на 2 (x%2==0) и все остальные.
         „исла, которые дел€тс€ на 3 и на 2 одновременно, например 6, попадают в оба списка.
         ѕор€док объ€влени€ списков очень важен.
         1.1 —оздай метод printList
         2. ћетод printList должен выводить на экран все элементы списка с новой строки.
         3. »спользу€ метод printList выведи эти три списка на экран.
         —начала тот, который дл€ x%3, потом тот, который дл€ x%2, потом последний.
         */

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("¬ведите число: ");
            list.add(scanner.nextInt());
        }
        for (Integer i: list) {
            if (i % 3 == 0 && i % 2 == 0) {
                list1.add(i);
                list2.add(i);
            } else if (i % 3 == 0) {
                list1.add(i);
            } else if (i % 2 == 0) {
                list2.add(i);
            }else 
                list3.add(i);
        }
        
        printList(list1);
        System.out.println();
        printList(list2);
        System.out.println();
        printList(list3);

        }
    public static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
