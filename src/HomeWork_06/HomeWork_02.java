package lesson_06.HomeWork_06;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        /**
         ������ 5 ����� � �������, ����� ����� �������� � ����� ������� ������.
         ������� ��������� ������ � �� �����.*/
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        //  int[] count = new int[5];
        int a = 0;
        String s = "";
        String d = "";

        for (int i = 0; i < array.length; i++) {
            System.out.print("������� ������: ");
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > a) {
                a = array[i].length();
                s = array[i];
            }else if (array[i].length() < a) {
                a = array[i].length();
                d = array[i];
            }
        }
        System.out.println("����� ������� ������: " + s + " , �����: " + s.length());
        System.out.println("����� �������� ������: " + d + " , �����: " + d.length());
    }
}

