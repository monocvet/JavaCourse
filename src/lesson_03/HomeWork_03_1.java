package lesson_03;

public class HomeWork_03_1 {
    public static void main(String[] args) {
        /** ������ 1 */
        int a = 10;
        int b = 15;
        int c = 8;

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("����������� ����������");
        } else {
            System.out.println("����������� �� ����������");
        }
    }
}
