package lesson_07;

public class Person2 implements PeopleInterface{
    @Override
    public void run() {
        System.out.println("������");
    }

    @Override
    public void jump() {
        System.out.println("�������");
    }

    @Override
    public void laugh() {
        System.out.println("�� �������");
    }

    @Override
    public void cry() {
        System.out.println("�� �������");
    }

    @Override
    public void suffer() {
        System.out.println("������� �������");
    }
}
