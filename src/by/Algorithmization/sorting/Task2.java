package by.Algorithmization.sorting;

import java.util.Arrays;

/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm . Образовать из них новую
последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
    public static void task2() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0, j=0; j < result.length; i++) {
            if(i<arr1.length){
                result[j]=arr1[i] ;
                j++;
            }
            if (i<arr2.length){
                result[j]=arr2[i] ;
                j++;
            }
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));;
        System.out.println(Arrays.toString(result));
    }
}
