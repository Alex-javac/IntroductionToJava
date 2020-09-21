package by.lesson1.cycles;
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task17 {
    public static void task17() {
        char simvol;
        System.out.println("Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
        for (int i =0;i<=65535;i++) {
            simvol = (char)i;
            System.out.println(i + " = " + simvol);
        }
    }
}

