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
        int max = list.get(0).length();
        int min = list.get(0).length();
        int minlength = 0;
        int maxlength = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("������� ������: ");
            list.add(scanner.nextLine());
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxlength = i;
            }else if (list.get(i).length() < max) {
                min = list.get(i).length();
                minlength = i;
            }
        }
        if (minlength >= maxlength)
            System.out.println(list.get(maxlength));
        else
            System.out.println(list.get(minlength));

    }
}
