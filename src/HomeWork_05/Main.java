package HomeWork_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact vasya = new Contact("����", "+79512148945", "mail@yandex.ru");
        Contact vitalik = new Contact("�������", "+79512148961", "mail@yandex.ru");
        Contact olga = new Contact("�����", "+7951214812", "mail@yandex.ru");
        Contact katya = new Contact("���������", "+79512148132", "mail@yandex.ru");
        Contact viktor = new Contact("������", "+79512148102", "mail@yandex.ru");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(vitalik);
        phoneBook.addContact(olga);
        phoneBook.addContact(katya);
        phoneBook.addContact(viktor);

        Scanner scanner = new Scanner(System.in);

        // ��������� ��������

        System.out.print("������� ��� ��������: ");
        String oldName = scanner.nextLine();
        System.out.print("������� ����� ���: ");
        String newName = scanner.nextLine();
        phoneBook.renameContact(oldName, newName);

        // ����� ��������

        System.out.print("������� ��� �������� ��� ������: ");
        String searchName = scanner.nextLine();
        phoneBook.searchContact(searchName);

        // �������� ��������

        System.out.print("������� ��� ��������, ������� ����� �������: ");
        String delName = scanner.nextLine();
        phoneBook.deleteContact(delName);


        System.out.println();

    }
}
