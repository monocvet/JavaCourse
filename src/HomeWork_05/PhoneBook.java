package HomeWork_05;

public class PhoneBook {
    private Contact[] contacts = new Contact[10];

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    // Переименование контакта
    public void renameContact(String oldName, String newName) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(oldName)) {
                contacts[i].setName(newName);
                break;
            }
        }
    }

    // Поиск контакта
    public void searchContact(String name) {
        for (int i = 0; i < contacts.length; i++) {
            contacts[i].getName().equalsIgnoreCase(name);
        }
    }


    // Удаление контакта
    public void deleteContact(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                contacts[i] = null;
            }
        }
    }
}
