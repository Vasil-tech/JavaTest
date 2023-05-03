package Cycles;

import java.util.Scanner;

public class CycleWhile {
    int i = 3;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите своё число: ");
        int i_1 = scan.nextInt();

        while(i_1 > 0){
            System.out.print(i_1 + ", ");
            i_1--;
        }
    }
}
