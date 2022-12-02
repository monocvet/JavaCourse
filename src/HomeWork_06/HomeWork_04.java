package lesson_06.HomeWork_06;

import java.util.Scanner;

public class HomeWork_04 {
    public static void main(String[] args) {
        /**     4
         1. ������� ������ �� 10 �����.
         2. ������� ������ �� 10 �����.
         3. ������ � ���������� 10 �����, ��������� ��� ������ �����.
         4. � ������ ������ ������� ����� �������� ����� ������ �� ������� �����, ������/����� ������
         ������� ��������� � ������� �������� �� ������� �����.
         */
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int[] count = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("������� �����: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
        for (int i = 0; i < count.length; i++) {
            count[i] = array[i].length();
            System.out.println(count[i]);

        }
    }
}
