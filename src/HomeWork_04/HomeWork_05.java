package lesson_04.HomeWork_04;

public class HomeWork_05 {
    public static void main(String[] args) {
        int b = 1;

        while (b <= 10) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(a * b + " ");
            }
            System.out.println();
            b++;
        }
    }
}
