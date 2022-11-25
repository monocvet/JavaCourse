package HomeWork_06;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        /**
         Ввести 5 строк с консоли, найти самую короткую и самую длинную строки.
         Вывести найденные строки и их длину.*/
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        int[] count = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите строку: ");
            array[i] = scanner.nextLine();
                   }
            //     for (int i = 0; i < array.length; i++) {
            //          count[i] = array[i].length();
            //      }
           // for (int i = 0; i < array.length; i++) {
              //  for (int j = i; j < array.length; j++) {
                 //   if (array[i] < array[j]) {
                  //      int x = array[i];
                  //      array[i] = array[j];
                  //      array[j] = x;

                  //  }
               // }
            }
        }

