package HomeWork_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact vasya = new Contact("Вася", "+79512148945", "mail@yandex.ru");
        Contact vitalik = new Contact("Виталий", "+79512148961", "mail@yandex.ru");
        Contact olga = new Contact("Ольга", "+7951214812", "mail@yandex.ru");
        Contact katya = new Contact("Екатерина", "+79512148132", "mail@yandex.ru");
        Contact viktor = new Contact("Виктор", "+79512148102", "mail@yandex.ru");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(vitalik);
        phoneBook.addContact(olga);
        phoneBook.addContact(katya);
        phoneBook.addContact(viktor);

        Scanner scanner = new Scanner(System.in);

        // Изменение контакта

        System.out.print("Введите имя контакта: ");
        String oldName = scanner.nextLine();
        System.out.print("Введите новое имя: ");
        String newName = scanner.nextLine();
        phoneBook.renameContact(oldName, newName);

        // Поиск контакта

        System.out.print("Введите имя контакта для поиска: ");
        String searchName = scanner.nextLine();
        phoneBook.searchContact(searchName);

        // Удаление контакта

        System.out.print("Введите имя контакта, который нужно удалить: ");
        String delName = scanner.nextLine();
        phoneBook.deleteContact(delName);


        System.out.println();

    }
}
