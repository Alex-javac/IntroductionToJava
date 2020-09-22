package by.Algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких несколько, то определить наименьшее из них.
public class Task9 {
    public static void task9() {
        int[] arr;
        int[] arrMost;
        int[] arrClipped;
        int maximumNumberOfElements=0;
        int min;
        int count;

        Scanner scanner = new Scanner(System.in);

        System.out.println("В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.");
        System.out.print("n = ");
        int lengthArr = scanner.nextInt();
        arr = new int[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));


        arrMost=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            arrMost[i] = count;
            if (count > maximumNumberOfElements)
                maximumNumberOfElements = count;
        }
        System.out.println(Arrays.toString(arrMost));
        count = 0;
        for (int i = 0; i < arrMost.length; i++) {
            if (maximumNumberOfElements == arrMost[i])
                count++;
        }

        arrClipped = new int[count];
        count = 0;
        for (int i = 0; i < arrMost.length; i++) {
            if (arrMost[i] == maximumNumberOfElements) {
                arrClipped[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrClipped));
        min = arrClipped[0];
        for (int i = 0; i < arrClipped.length; i++) {
            if (arrClipped[i] < min)
                min = arrClipped[i];
        }
        System.out.println("Если таких несколько, то определить наименьшее из них.");
        System.out.println(min);
    }
}
