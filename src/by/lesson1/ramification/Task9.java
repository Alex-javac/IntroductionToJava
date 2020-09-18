package by.lesson1.ramification;

import java.util.Scanner;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task9 {
    public static void task9() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3)");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        System.out.print("x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("y3 = ");
        int y3 = scanner.nextInt();

        boolean result = (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1);

        if(result){
            System.out.println("Данные точки расположены на одной прямой");
        } else {
            System.out.println("Данные точки не расположены на одной прямой");
        }
    }
}
