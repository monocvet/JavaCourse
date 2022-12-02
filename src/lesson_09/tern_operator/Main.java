package lesson_09_hash_code._tern_operator;

public class Main {
    public static void main(String[] args) {
        People people = new People("Вася", 13);
//
//        if (people.getAge() < 16) {
//            System.out.println("Нет, ");
//        }
//
        String answer = people.getAge() < 16 ? "Нет, " + people.getName() + " Ты не сможешь пройти!" : "Да, " + people.getName() + " Проходи";
        System.out.println(answer);
    }
}
