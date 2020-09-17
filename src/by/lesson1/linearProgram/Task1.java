package by.lesson1.linearProgram;

import java.util.Scanner;

//Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c
public class Task1 {
    public static double valueTask1(int a, int b, int c){
        double result = (((a-3)*b/2)+c);
        return result;
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c");
        System.out.print("а = ");
    int a = scanner.nextInt();
        System.out.print("b = ");
    int b = scanner.nextInt();
        System.out.print("c = ");
    int c = scanner.nextInt();

        System.out.println("Значение функции = "+ valueTask1(a,b,c));
    }
}
