package Arrays;

import java.util.Random;

public class ThreeArr {
    public static void main(String[] args){
        int[][][] arr = new int[3][3][3];
        arr[0][0][0] = 5;
        arr[0][0][1] = 5;
        arr[0][0][2] = 5;

        arr[1][0][0] = 5;
        arr[1][1][0] = 5;
        arr[1][1][1] = 5;
        arr[0][0][2] = 4;
        arr[0][2][0] = 4;
        arr[0][2][2] = 4;
        arr[2][1][0] = 4;
        arr[2][1][0] = 4;

        for(int[][] i : arr){
            for(int[] j : i){
                for(int k : j){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
