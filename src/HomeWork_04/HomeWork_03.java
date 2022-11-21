package HomeWork_04;

import java.util.Scanner;

public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите первое число: ");
        int a = scanner.nextInt();
        System.out.print("¬ведите второе число: ");
        int b = scanner.nextInt();
        System.out.print("¬ведите третье число: ");
        int c = scanner.nextInt();

        if ((a >= b) && (a <= c) || (a < b) && (a > c)) {
            System.out.println(a);
        } else if ((b >= a) && (b <= c) || (b < a) && (b > c)) {
            System.out.println(b);
        } else if ((c >= b) && (c <= a) || (c < b) && (c > a)) {
            System.out.println(c);
        } else if ((a == b && b == c)) {
            System.out.println(a);
        }

    }
}
