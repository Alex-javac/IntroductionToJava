package by.Algorithmization.sorting;

import java.util.Arrays;

/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...bm,
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm  в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task7 {
    public static void task7() {
        int[] arr1 = new int[]{1, 3, 6, 8, 9};
        int[] arr2 = new int[]{1, 2, 4, 4, 5, 7, 12, 13};
        int[] result= new int[arr1.length + arr2.length];

        for (int i = 0,counterArr1=0,counterArr2=0; i < result.length;counterArr1++) {
            if (counterArr1< arr1.length){
                result[i]=arr1[counterArr1];
                i++;
            }
            for (int j = counterArr2; j < arr2.length; j++) {
                if( i < result.length){
                if(counterArr1+1<arr1.length) {
                    if (arr2[j] <= arr1[counterArr1+1]) {
                        result[i]=arr2[j];
                        i++;
                        counterArr2++;
                    }
                }else {
                    result[i]=arr2[j];
                    i++;
                    counterArr2++;
                }
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(result));

    }
}
