package HomeWork_09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class HomeWork_09_5 {
    public static void main(String[] args) {
        /**  5
         1. ������ ������ �����.
         2. ������ � ���� 5 ����� � ����������.
         3. ������� 13 ���: ������� ��������� ������ � �������� � � ������.
         4. ��������� ���� ������ ���������� ��������������� ������ �� �����, ������ �������� � ����� ������.
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("������ ������: ");
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(4));
        }
        for (String a: list) {
            System.out.println(a);
        }
    }
}
