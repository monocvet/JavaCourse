package HomeWork_09;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class HomeWork_09_7 {
    public static void main(String[] args) {
        /**   7
         1. ����� � ���������� 20 �����, c������ �� � ������ � ����������� �� ��� ������ �������:
         ����� ������ ������� �� 3 (x%3==0), ������ ������� �� 2 (x%2==0) � ��� ���������.
         �����, ������� ������� �� 3 � �� 2 ������������, �������� 6, �������� � ��� ������.
         ������� ���������� ������� ����� �����.
         1.1 ������ ����� printList
         2. ����� printList ������ �������� �� ����� ��� �������� ������ � ����� ������.
         3. ��������� ����� printList ������ ��� ��� ������ �� �����.
         ������� ���, ������� ��� x%3, ����� ���, ������� ��� x%2, ����� ���������.
         */

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("������� �����: ");
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
