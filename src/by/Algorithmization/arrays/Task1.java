package by.Algorithmization.arrays;

import java.util.Random;
import java.util.Scanner;

//В массив A [N] занесены натуральные числа.
//Найти сумму тех элементов, которые кратны данному К
public class Task1 {
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("В массив A [N] занесены натуральные числа.");
        System.out.print("N = ");
        int lengthArr = scanner.nextInt();
        int[] arr = new int[lengthArr];
        Random rand = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i]=rand.nextInt();
        }
        System.out.println("Найти сумму тех элементов, которые кратны данному К");
        System.out.print("K = ");
        int k = scanner.nextInt();
        long sum=0;
        for (int element: arr) {
            if (element % k == 0) {
                sum += element;
            }
        }
        System.out.println("Сумма равна "+ sum);
    }
}
