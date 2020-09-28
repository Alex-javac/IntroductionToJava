package by.Algorithmization.sorting;

import java.util.Arrays;

/*
Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void task3() {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int max_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
