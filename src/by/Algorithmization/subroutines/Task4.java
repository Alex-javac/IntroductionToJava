package by.Algorithmization.subroutines;
// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
// из пар точек самое большое расстояние. Указание. Координаты точек занести в массив
public class Task4 {
    public static void task4(){
        int[][] coordinatXY={{1,9},{8,7},{1,7},{1,2},{3,2},{1,4},{2,6},{2,1},{5,7},{1,1}};
        int[] pointOne = new int[2];
        int[] pointTwo = new int[2];
        double distance = 0;
        for (int i = 0; i <coordinatXY.length-1 ; i++) {
            for (int j = coordinatXY.length-1; j >i ; j--) {
                //AB = √(xb - xa)2 + (yb - ya)2
                double distanceTemp = Math.sqrt(Math.pow((coordinatXY[i][0] - coordinatXY[j][0]), 2) + Math.pow((coordinatXY[i][1] - coordinatXY[j][1]), 2));
//                System.out.println(coordinatXY[i][0]+","+coordinatXY[i][1]+" and "+coordinatXY[j][0]+","+coordinatXY[j][1]);
//                System.out.println(distanceTemp);
                if (distanceTemp > distance) {
                    pointOne[0]=coordinatXY[i][0];
                    pointOne[1]=coordinatXY[i][1];
                    pointTwo[0]=coordinatXY[j][0];
                    pointTwo[1]=coordinatXY[j][1];
                    distance = distanceTemp;
                }
            }
        }
        System.out.println("Cамое большое расстояние между точками: ");
        System.out.println(pointOne[0]+","+pointOne[1]+" и "+pointTwo[0]+","+pointTwo[1]);
        System.out.println("Расстояние ="+distance);
    }
}