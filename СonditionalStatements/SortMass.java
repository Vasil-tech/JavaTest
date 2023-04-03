package СonditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class SortMass {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int arr_int = scan.nextInt(); 
        int[] arr = new int[arr_int];
        for(int i = 0; i < arr_int; i++){
            System.out.print("Число массива ");
            int j = scan.nextInt();
            arr[i] = j;
            System.out.println();
        }
        System.out.println("Массив: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Число массива " + arr[i]);
        }
        int min = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(min < arr[i]){
                arr[i] = min;
            }
            System.out.print("Отсортированный массив " + Arrays.toString(arr));

        }
    }
}
