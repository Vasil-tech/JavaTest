package Cycles;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите своё число: ");
        int num = scan.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = i + 1;
        }
        
        System.out.print("Делители числа: ");

        for(int i = 0; i < num; i++){
            if(num % arr[i] == 0) { System.out.print(arr[i] + " "); }
        }
    }
}
