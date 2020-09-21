package by.Algorithmization.arrays;

import java.util.Scanner;

//Дана последовательность действительных чисел а1 ,а2 ,..., аn.
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
public class Task2 {
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дана последовательность действительных чисел а1 ,а2 ,..., аn.");
        System.out.print("n = ");
        int lengthArr = scanner.nextInt();
        int[] arr = new int[lengthArr];

        for (int i=0; i<lengthArr; i++){
            arr[i]=i+1;
        }
        System.out.println("Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.");
        System.out.print("Z = ");
        int z = scanner.nextInt();
        int count=0;

        for (int i=0; i<arr.length; i++) {
            if(arr[i]>z) {
                arr[i]=z;
                count++;
            }
        }
        System.out.println("Количество замен ="+count);
    }
}
