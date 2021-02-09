package by.Algorithmization.subroutines;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class Task3 {
    public static void task3(){
        int a = 6;
        double areaOfHexagon;
        areaOfHexagon = triangleSquare(a) * 6;
        System.out.println("Площадь правильного шестиугольника = "+areaOfHexagon);
    }
    static double triangleSquare(int num){
        return (Math.sqrt(3)/4)*(Math.pow(num,2));
    }
}
