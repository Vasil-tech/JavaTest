package Cycles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int i_1 = scan.nextInt();

        System.out.print("Factorial: ");
        int i = 1;
        int i_3 = 1;
        while(i <= i_1){
            i_3 *= i;
            System.out.print(i_3 + ", ");
            i++;
        }
    }
}
