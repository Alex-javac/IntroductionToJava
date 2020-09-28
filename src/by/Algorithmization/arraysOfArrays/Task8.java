package by.Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class Task8 {
    public static void task8() {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix=new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("В числовой матрице поменять местами два столбца");
        System.out.print("Номер столбца 1 = ");
        int column1 = scanner.nextInt();
        System.out.print("Номер столбца 2 = ");
        int column2 = scanner.nextInt();
        if(column1==column2) {
            System.out.println("В этом нет никакого смысла");
        }
        else if(column1>=1 && column1<=matrix.length && column2>=1 && column2<=matrix.length) {
            int interim;
            for (int i = 0; i < matrix.length ; i++) {
                interim = matrix[i][column1-1];
                matrix[i][column1-1] = matrix[i][column2-1];
                matrix[i][column2-1] = interim;
            }
            for (int i = 0; i < matrix.length; i++){
                System.out.println(Arrays.toString(matrix[i]));
            }
        }else {
            System.out.println("Номер столбца не соответствует размеру матрицы");
            task8();
        }
    }
}