package Cycles;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i_1 = scan.nextInt();
        for(int i = 1; i <= i_1; i++){
            int multi = i_1 * i;
            System.out.println("Умножение числа " + i + " даст: " + multi);
        }
    }
}
