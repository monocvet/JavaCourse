package HomeWork_06;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        /**
         ������ 5 ����� � �������, ����� ����� �������� � ����� ������� ������.
         ������� ��������� ������ � �� �����.*/
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
       // int array = str.array();


        for (int i = 0; i < array.length; i++) {
            System.out.print("������� �����: ");
            String a = scanner.nextLine();
            array[i] = a;
        }
    }
}
