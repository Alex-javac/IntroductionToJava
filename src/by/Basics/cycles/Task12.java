package by.Basics.cycles;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число.
//А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task12 {
    public static void task12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int numb = scanner.nextInt();
        if (numb>0){
            int sum=0;
            for(int i = 1; i<=numb; i++) {
                sum += i;
            }
        System.out.println("Сумма чисел от 1 до "+ numb + " = " + sum);
    } else {
            System.out.println("Вы ввели некорректное число");
            task12();
        }
    }
}
