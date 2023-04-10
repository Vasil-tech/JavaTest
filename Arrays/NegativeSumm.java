package Arrays;

import java.util.Scanner;

public class NegativeSumm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int arr_size = scan.nextInt();
        int[] arr = new int[arr_size];

        System.out.println("Введите числа массива: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Массив: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        int SumNeg = 0;
        for(int i :arr){ if(i < 0){ SumNeg += i; } }

        if (SumNeg == 0) { System.out.println("Нет цифр меньше 0"); }
        else { System.out.println("Сумма негативных чисел массива: " + SumNeg); }
    }
}
