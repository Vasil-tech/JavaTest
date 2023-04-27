package Algoritms;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите своё число: ");
        int int_1 = scan.nextInt();
        int sum = 0;

        while(int_1 != 0){
            sum += int_1 % 10;
            int_1 /= 10;
        }
        System.out.print("Результат: " + sum);
    }
}
