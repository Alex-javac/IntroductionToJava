package by.Algorithmization.arrays;

import java.util.Scanner;

//Даны целые числа а1 ,а2 ,..., аn.
//Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void task5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Даны целые числа а1 ,а2 ,..., аn");
        System.out.print("n = ");
        int lengthArr = scanner.nextInt();
        int[] arr = new int[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
        System.out.println("Вывести на печать только те числа, для которых аi > i");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>i) {
                System.out.println("Элемент массива с индексом "+ i +" = " + arr[i]);
            }
            }

        }
    }

