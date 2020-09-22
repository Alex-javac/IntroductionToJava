package by.Algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task10 {
    public static void task10() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Дан целочисленный массив с количеством элементов п.");
        System.out.print("n = ");
        int lengthArr = scanner.nextInt();
        int[]arr = new int[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).");
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i <arr.length ; i+=2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
