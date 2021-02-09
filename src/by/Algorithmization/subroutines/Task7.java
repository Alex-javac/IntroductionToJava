package by.Algorithmization.subroutines;
// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {
    public static void task7() {
        int factorialSum =0;
        for (int i=1;i<10;i++) {
            if(i%2!=0){
                int temp=1;
                for (int j=1;j<i+1;j++){
                    temp*=j; }
                factorialSum+=temp;
                System.out.println(i+"!="+temp);
            }
        }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна "+factorialSum);
    }
}
