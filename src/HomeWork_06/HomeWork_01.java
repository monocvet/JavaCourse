package HomeWork_06;

import java.util.Scanner;

public class HomeWork_01 {
    public static void main(String[] args) {
        /**
         ������: ��������� ������ ������, ���� ������������ �� ����� ������ ������ (����� enter).
         ����� ��� ������������ ������ � ������� ������� (���� ������������ � ����) � ������� �� �� �����.

         ����� ������: ��������� ������ ������, ���� ������������ �� ����� ������ ������ (����� enter).
         ���� � ������ ������ ����� ����, ������ �����������, ���� �������� - �����������.
         ��������� ������� ����� �� �����.*/

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[100];

        for (int i = 0; i < array.length; i++) {
            System.out.print("������� �����: ");
            String a = scanner.nextLine();
            array[i] = a;
            if (a.isEmpty()) {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toUpperCase());
            if (array[i].isEmpty()) {
                break;
            }
        }

            for (int i = 0; i < array.length; i++) {
                if (array[i].length() % 2 == 0) {
                    System.out.println(array[i] + " " + array[i]);
                } else {
                    System.out.println(array[i] + " " + array[i] + " " + array[i]);
                }
            }
        }
    }




