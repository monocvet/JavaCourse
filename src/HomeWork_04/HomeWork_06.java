package HomeWork_04;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите ваше им€: ");
        String name = scanner.nextLine();
        System.out.print("¬ведите дату вашего рождени€: ");
        int d = scanner.nextInt();
        System.out.print("¬ведите мес€ц вашего рождени€: ");
        int m = scanner.nextInt();
        System.out.print("¬ведите год вашего рождени€: ");
        int y = scanner.nextInt();

        System.out.println("ћен€ зовут " + name + "." );
        System.out.println("я родилс€ " + d + "." + m + "." + y);
    }
}
