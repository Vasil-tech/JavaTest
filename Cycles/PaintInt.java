package Cycles;

import java.util.Scanner;

public class PaintInt {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int i_1 = scan.nextInt();

            for(int i = 1; i <= i_1; i++) {
                for(int j = 1; j <= i; j++)
                    System.out.print(i);
                System.out.println("");
            }
        }
    }
}
