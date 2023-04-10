package Arrays;

import java.util.Scanner;

public class ReversArr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int arr_size = scan.nextInt();
        int[] arr = new int[arr_size];

        System.out.println("Введите числа массива: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Массив до сортировки: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Массив после сортировки: ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
