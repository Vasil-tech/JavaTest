package Arrays;

import java.util.Scanner;

public class UserArr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int arr = scan.nextInt();
        int[] array = new int[arr];
        int i = 0;
        do{
            System.out.print("Введите " + (i + 1) + "-oe число массива: ");
            int arr_num = scan.nextInt();
            array[i] = arr_num; 
            i++;
        }while(i < arr);
    }  
}
