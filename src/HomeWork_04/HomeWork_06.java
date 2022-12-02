package lesson_04.HomeWork_04;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� ���: ");
        String name = scanner.nextLine();
        System.out.print("������� ���� ������ ��������: ");
        int d = scanner.nextInt();
        System.out.print("������� ����� ������ ��������: ");
        int m = scanner.nextInt();
        System.out.print("������� ��� ������ ��������: ");
        int y = scanner.nextInt();

        System.out.println("���� ����� " + name + "." );
        System.out.println("� ������� " + d + "." + m + "." + y);
    }
}
