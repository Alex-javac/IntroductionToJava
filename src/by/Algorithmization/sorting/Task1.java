package by.Algorithmization.sorting;

import java.util.Arrays;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */
public class Task1 {
    public static void task1(){
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int k = 2;

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0, j=0; i < result.length; i++) {
            if (i <= k-1) {
                result[i] = arr1[i];
            } else {
                if (i > k-1 + arr2.length) {
                    result[i] = arr1[i - arr2.length];
                } else {
                    result[i] = arr2[j];
                    j++;
                }
            }

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Объединить два массива, включив второй массив между k и (k+1) элементами первого." + "\n k = "+k);
        System.out.println(Arrays.toString(result));
    }
}
