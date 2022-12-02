package lesson_06.HomeWork_06;

import java.util.Scanner;

public class HomeWork_03 {
    public static void main(String[] args) {
        /**   3
         1. ������� ������ �� 10 �����.
         2. ������ � ���������� 8 ����� � ��������� �� � ������.
         3. ������� ���������� ����� ������� (10 ���������) �� ����� � �������� �������. ������ ������� - � ����� ������.
         * */
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];

        for (int i = 0; i <= 7; i++) {
            System.out.print("������� �����: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
