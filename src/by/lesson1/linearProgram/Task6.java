package by.lesson1.linearProgram;
//Для данной области составить линейную программу, которая печатает true,
//если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

import java.util.Scanner;

public class Task6 {
    public static boolean valueTask6(int x, int y){
        boolean isPointInSquareOne;
        boolean isPointInSquareTwo;
        boolean result;
        isPointInSquareOne = -2 <= x && x <=2 && 0< y && y <= 4;
        isPointInSquareTwo =-4 <= x && x <= 4 && -3 <= y && y <= 0;
        result = isPointInSquareOne||isPointInSquareTwo;
        return result;

    }
    public static void task6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Определить принадлежит ли точка закрашенной области координатной плоскости:");
        System.out.print("Абсцисса x = ");
        int x = scanner.nextInt();
        System.out.print("Ордината y = ");
        int y = scanner.nextInt();

        System.out.println("Результат = "+ valueTask6(x,y));
    }
}
