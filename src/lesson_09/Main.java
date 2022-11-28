package lesson_09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 11;
        int length = array.length;
        int a = 0;
        Integer b = 10;

        // 1. �������� ��������� � ���������� � ��� ���������
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        // 2. ����� add() - c ��������� �������
        list.add(2,88);


        // 3. ����� set() - �������� �������� �� ������������� �������
        list.set(3,99);

        // 4. ����� size() - ���������� ������ ���������

        System.out.println(list.size());

        // 5. ����� get() - ����� ������� ����� ���������

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " , ");

        }
        System.out.println();

        for (Integer c: list) {
            System.out.print(c + " , ");
        }
        // 6. ����� toArray() - �������������� ��������� � ������

        Object [] objects = list.toArray();

        System.out.println();

        for (Object o: objects) {
            System.out.print(o + " , ");
        }

        System.out.println();

        // 7. ����� contains() - ���������� �� � ��������� ������������ �������
        System.out.println("���������� �� � ��������� ����� 101 - " + list.contains(101));
        System.out.println("���������� �� � ��������� ����� 88 - " + list.contains(88));

        // 8. ����� addAll() - �������� ��� �������� � ����� �������� �� ������

        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);

        // 10. ����� remove() - �������� ��������� ��������� �� ������������� �������

        System.out.println(" �� ������ ������ remove() �� ������� 0  " + list);
        list.remove(0);
        System.out.println(" ����� ������ ������ remove() �� ������� 0 " + list);

        // 10. ����� indexOf() - ������������ ������ �������� ���������
        System.out.println("������ �������� 88 - " + list.indexOf(88));

        // 11. ����� sort() - ����������

//        List<Integer> list1 = new ArrayList<>();
//        list1.add(11);
//        list1.add(99);
//        list1.add(77);
//        list1.add(55);
//        list1.add(22);

        // 12. ����� isEmpty() - �������� ������ ���� ��� ���

        System.out.println(list.isEmpty());

        // 13. ����� clear() - �������� ���� ��������� ���������

        list.clear();



        System.out.println(list);


        HashSet<String> strings = new HashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("FFF");
        strings.add(null);

        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("CCC");
        strings.add("DDD");
        strings.add(null);

        for (Iterator<String> iter = strings1.iterator(); iter.hasNext();)
            System.out.println(iter.next());




        System.out.println();

//        Method.print(3, 5);
    }

}
