package lesson_09_hash_code._tern_operator;

public class Main {
    public static void main(String[] args) {
        People people = new People("����", 13);
//
//        if (people.getAge() < 16) {
//            System.out.println("���, ");
//        }
//
        String answer = people.getAge() < 16 ? "���, " + people.getName() + " �� �� ������� ������!" : "��, " + people.getName() + " �������";
        System.out.println(answer);
    }
}
