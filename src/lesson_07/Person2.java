package lesson_07;

public class Person2 implements PeopleInterface{
    @Override
    public void run() {
        System.out.println("Трезво");
    }

    @Override
    public void jump() {
        System.out.println("Задорно");
    }

    @Override
    public void laugh() {
        System.out.println("От счастья");
    }

    @Override
    public void cry() {
        System.out.println("От радости");
    }

    @Override
    public void suffer() {
        System.out.println("Слезами радости");
    }
}
