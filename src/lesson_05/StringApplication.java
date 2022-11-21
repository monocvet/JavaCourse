package lesson_05;

public class StringApplication {
    public static void main(String[] args) {
        String str = "Hello world!";
        String str1 = new String("Hello world");
        str1 += "!";

        System.out.println(str);
        System.out.println(str1);

        for (int i = 0; i < 10; i++) {
            str1 += "!";
        }
        System.out.println(str1);

    }
}
