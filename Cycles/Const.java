package Cycles;

import java.util.Scanner;

public class Const {
    public static void main(String[] args){
        final int bibka = 13;
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter: ");
            int i = scan.nextInt();
            if(i == bibka) break;
        }
    }
}
