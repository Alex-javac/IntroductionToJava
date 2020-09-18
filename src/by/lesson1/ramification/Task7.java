package by.lesson1.ramification;

import java.util.Scanner;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник , и если да ,
// то будет ли он прямоугольным.
public class Task7 {
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Даны два угла треугольника (в градусах)");
        System.out.print("a = ");
        double AngleA = scanner.nextDouble();
        System.out.print("b = ");
        double AngleB = scanner.nextDouble();
        double AngleC = 180 - AngleA - AngleB;

        System.out.println("Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
        if(AngleC>0 && AngleC<180 &&
                AngleA>0 && AngleA<180 &&
                AngleB>0 && AngleB <180) {

            System.out.println("Треугольник с углами: " + AngleA + ", " + AngleB
                    +", "+AngleC+ " градусов существует.");
            if (AngleA == 90 || AngleB == 90 || AngleC == 90) {
                System.out.println("Такой треугольник является прямоугольным");
            } else {
                System.out.println("Такой треугольник не является прямоугольным");
            }
        }else {
            System.out.println("Треугольник с углами: " + AngleA + ", " + AngleB
                    +", "+AngleC+"  градусов не существует.");
        }
    }
}
