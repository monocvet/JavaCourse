package HomeWork_09;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_09_4 {
    public static void main(String[] args) {
        /**  4
         1. ������ ������ ����� � ������ main.
         2. ������ � ���� 10 ������� � ����������, �� ������ ��������� �� � ����� ������, � � ������.
         3. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("������� �����������: ");
            list.add(0, scanner.nextLine());
        }
        for (String a: list) {
            System.out.println(a);
        }
    }
}
