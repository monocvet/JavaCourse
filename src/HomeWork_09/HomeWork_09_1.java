package HomeWork_09;

import java.util.ArrayList;

public class HomeWork_09_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("������, ���!");
        list.add("�� �� ����� ��� ���.");
        list.add("� ���� ����� ������.");
        list.add("�� ���� ���� ������ �������� �����.");
        list.add("�� ����� ��������� ������� �� ��������.");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("������ ���������: " + list.size());
    }
}
