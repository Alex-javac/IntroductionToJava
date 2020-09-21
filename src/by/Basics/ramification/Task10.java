package by.Basics.ramification;

import java.util.Random;
import java.util.Scanner;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//Определить, пройдет ли кирпич через отверстие.
public class Task10 {
    public static void task10() {
        Scanner scanner = new Scanner(System.in);

        Random randomA = new Random();
        Random randomB = new Random();
        int a = randomA.nextInt(200);
        int b = randomB.nextInt(200);

        System.out.println("Определить, пройдет ли кирпич через отверстие.");
        System.out.println("Размеры отверстия А = "+a+" B = "+b);
        System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();

        if (x < a && y < b || y < a && x < b || x < a && z < b || z < a && x <= b || z < a && y < b || y < a && z < b) {
            System.out.println("Кирпич проходит через отверстие");
        } else{
            System.out.println("Кирпич не проходит через отверстие");
        }
    }
}
