package lesson_04;

public class Aplication {
    public static void main(String[] args) {
//       //циклы
//        // fori, wwhile, foreach
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World!");

        //1. вывести все четные числа от одного до 50
//        for (int =0;
//        i <= 50;
//        i++){
//            if (i % 2 == 0) {
//                System.out.println(i);
//        for (int i = 10; i <=20; i++ ) {
//            if ()
//        for (int i = 10; i <= 40; i++) {
//            if ((i < 15) || i > 20 ) {
//                System.out.print(i + " ");
//                int
//                for (int i = 10; i<= 50; i++) {
//                    if (i % 2 == 0) {
//                        int summa = 0;
//                        System.out.print(i);
//
//
//
//
//            }
//        }


        // arrays - массивы

        // Arrays - Массивы
        // используем данные только одного типа

//        int [] array = new int[10];
//        int [] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[100];
//        array3 [0] = 11;
//        array3 [1] = 22;
//        array3 [2] = 33;
//        array3 [3] = 44;
//        array3 [4] = 55;


        for (int i = 0; i < 100; i++) {
            array3[i] = i + 1;
        }


        // 1. печать каждой ячейки массива
        for (int i = 0; i < 5; i++) {
            System.out.println(array3[i]);
        }

        //2. печать только четных элементов масива

        for (int i = 0; i < 100; i++) {
            if (array3[i] % 2 == 0) {
                System.out.println(array3[i]);
            }
        }

        // 3. печатать массив нечетных индексов от 10 до 30

        for (int i = 10; i <= 30; i++) {
            if (array3[i] % 2 != 0) {
                System.out.print(array3[i] + " ");
            }
        }


        System.out.println();
    }
}

