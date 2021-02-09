package by.Algorithmization.subroutines;

import java.util.Scanner;

// Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m
public class Task8 {
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
int[] arr = {17,12,87,32,14,2,6,21,57};
int num;
        System.out.println("Введите число от 0 до "+ (arr.length-3) +":");
        num= scanner.nextInt();
        if (num<=(arr.length-3)&&num>=0) {
            sumThreeNumbers(arr, num);
        }
        else {
            task8();
        }
    }
   public static int sumThreeNumbers(int[] arr, int num){
        int endLine =num+3;
        int sum=0;
        for (int i=num;i<endLine;i++){
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Сумма трех последовательно расположенных элементов ="+sum);
        return sum;
    }
}
