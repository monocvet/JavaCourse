package HomeWork_09;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_09_6 {
    public static void main(String[] args) {
        /** 6
         1. ������ ������ �����.
         2. ������ � ���� 10 ������� � ����������.
         3. �����, ����� ������ � ������ ���������� ������: ����� �������� ��� ����� �������.
         ���� ����� ����� ���������, �� ������ ���� ������ ����� ������ �� ���.
         4. ������ �� ����� ������ �� ������ 3. ������ ���� �������� ���� ������.
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("������� ������: ");
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            int a = 0;
            int b = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).length() >= list.get(j).length()) {
                    a++;
                }
                if (list.get(i).length() <= list.get(j).length()) {
                    b++;
                }
                if (a == 5 || b == 5) {
                    System.out.println(list.get(i));
                }
            }

        }
    }
}
