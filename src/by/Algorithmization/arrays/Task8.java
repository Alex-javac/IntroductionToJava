package by.Algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Дана последовательность целых чисел  a1 ,a2 , ,an .
//Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1 ,a2 , ,an ).
public class Task8 {
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дана последовательность целых чисел а1 ,а2 ,..., аn.");
        System.out.print("n = ");
        int lengthArr = scanner.nextInt();
        int[] arr = new int[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1 ,a2 , ,an ).");
        int min = arr[0];
        for (int k : arr) {
            min = Math.min(k, min);
        }

        int countMin=0;
        for (int k : arr) {
            if (k == min) {
                countMin++;
            }
        }

        int[] arrNew = new int[arr.length-countMin];
        for (int i = 0, j=0; i<arr.length; i++) {
            if(arr[i]!=min) {
                arrNew[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
