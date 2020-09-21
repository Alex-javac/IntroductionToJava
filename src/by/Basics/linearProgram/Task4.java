package by.Basics.linearProgram;
// Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
    public static double valueTask4Numb(double x){
        double result = (x * 1000) % 1000 + (int) x / 1000.0;
        return result;
    }
    public static double valueTask4Str(double x){
        String[] strings=Double.toString(x).split("\\.");
        double dd=Double.parseDouble("0."+strings[0]);
        double dd2=Double.parseDouble(strings[1]);
        double result = dd2+dd;
        return result;
    }
    public static void task4() {
        double num = 123.321;
        System.out.println("Дано действительное число R вида nnn.ddd: "+num);
        System.out.println("Поменять местами дробную и целую части числа и вывести полученное значение числа.");
        System.out.println("Способ 1: "+valueTask4Numb(num));
        System.out.println("Способ 2: "+valueTask4Str(num));
    }
}
