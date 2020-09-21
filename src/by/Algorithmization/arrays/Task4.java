package by.Algorithmization.arrays;

import java.util.Scanner;
//Даны действительные числа а1 ,а2 ,..., аn.
//Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Даны действительные числа а1 ,а2 ,..., аn");
        System.out.print("n = ");
        int lengthArr = scanner.nextInt();
        double[] arr = new double[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double)(Math.random()*100);
        }
        double max = arr[0];
        double min = arr[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                indexMax=i;
            }
            if(arr[i]<min){
                min=arr[i];
                indexMin=i;
            }
        }
        double intermediateNumber;
        System.out.println("Индекс максимального элемента массива = " + indexMax);
        System.out.println("Элемент массива с индексом "+ indexMax +" = " + arr[indexMax]);
        System.out.println("Индекс минимального элемента массива = " + indexMin);
        System.out.println("Элемент массива с индексом "+ indexMin +" = " + arr[indexMin]);
        intermediateNumber= arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = intermediateNumber;
        System.out.println("Поменять местами наибольший и наименьший элементы.");
        System.out.println("Элемент массива с индексом "+ indexMax +" = " + arr[indexMax]);
        System.out.println("Элемент массива с индексом "+ indexMin +" = " + arr[indexMin]);
    }
}
