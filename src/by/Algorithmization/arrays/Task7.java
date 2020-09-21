package by.Algorithmization.arrays;

//Даны действительные числа a1 ,a2 , ,a2n.
// Найти max(a1+a2n , a2+a2n-1, ...., an+an+1)
public class Task7 {
    public static void task7() {
        System.out.println("Даны действительные числа a1 ,a2 , ,a2n");
        System.out.print("Где n = 20");
        int lengthArr = 20;
        double[] arr = new double[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) (Math.random() * 100 - 10);
        }

    }
}
