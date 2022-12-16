package lesson_06;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();


        Cat barsik = new Cat("Barsik");
        Cat murzic = new Cat("Murzik");
        Cat snezhok = new Cat("Snezhok", 7,8.3, "Ginger");
        Cat neizv = new Cat();

        System.out.print(barsik.getName() + "  " + murzic.getName() + "  " + snezhok.getName() + "  " + neizv.getName());
        neizv.setName("Kot");
        neizv.setAge(3);
        neizv.setWeight(5.2);
        neizv.setColor("Grey");

        snezhok.setAge(8);

        Dog sharik = new Dog("Sharik", 10, 12.5, "White");

        System.out.println();

        animal.say();
        snezhok.say();
        sharik.say();


        System.out.println();

    }
}
