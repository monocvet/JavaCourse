package HomeWork_04;

import java.util.Scanner;

public class HomeWork_01 {
    public static void main(String[] args) {
        /** Задача №1 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую сторону прямоугольника: ");
        int m = scanner.nextInt();
        System.out.print("Введите вторую сторону пря2моугольника: ");
        int n = scanner.nextInt();

    for (int a = m; a > 0; a -- ) {
        for (int b = n; b > 0; b --) {
            System.out.print("8");
        }
        System.out.println();
        }
    }
}
