package HomeWork_06;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        /**
         ������ 5 ����� � �������, ����� ����� �������� � ����� ������� ������.
         ������� ��������� ������ � �� �����.*/
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        int[] count = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("������� �����: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
        int max = count[4];
        for (int i = 0; i < array.length; i++) {
            count[i] = array[i].length();
            if (max < count[i]) {
                max = count[i];
            }
        }
        System.out.println(max);

    }
}

