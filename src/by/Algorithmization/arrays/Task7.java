package by.Algorithmization.arrays;

import java.util.Arrays;

//Даны действительные числа a1 ,a2 , ,a2n.
// Найти max(a1+a2n , a2+a2n-1, ...., an+an+1)
public class Task7 {
    public static void task7() {
        System.out.println("Даны действительные числа a1 ,a2 , ,a2n");
        System.out.print("Где n = 20");
        int lengthArr = 20;
        double[] arr = new double[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 10);
        }
        System.out.println("\n"+"Найти max(a1+a2n , a2+a2n-1, ...., an+an+1)");
        System.out.println(Arrays.toString(arr));
        double[] sumArr = new double[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            sumArr[i] = arr[i] + arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(sumArr));
        double max = sumArr[0];
        for (double v : sumArr) {
            max = Math.max(v, max);
        }
        System.out.println("Max = "+max);
    }
}