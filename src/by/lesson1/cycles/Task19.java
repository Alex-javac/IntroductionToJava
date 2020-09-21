package by.lesson1.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task19 {
    public static void task19() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        System.out.print("num1 = ");
        int num1 = scanner.nextInt();
        System.out.print("num2 = ");
        int num2 = scanner.nextInt();

        String string = String.valueOf(num1);
        char[] arrayNum1 = string.toCharArray();

        String str = String.valueOf(num2);
        char[] arrayNum2 = str.toCharArray();

        for (int i=0;i<arrayNum1.length;i++){
            for (int j=0;j<arrayNum2.length;j++){
                if(arrayNum1[i]==arrayNum2[j]){
                    System.out.println("Цифра " +arrayNum1[i]+" входит в запись как первого так и второго числа");
                }
            }
        }

    }
}
