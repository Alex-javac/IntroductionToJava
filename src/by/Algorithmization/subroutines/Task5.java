package by.Algorithmization.subroutines;
// Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Arrays;

public class Task5 {
    public static void task5(){
        int[] arr={17,12,87,32,14,52,58,75};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
