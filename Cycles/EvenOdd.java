package Cycles;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int number = scan.nextInt();
        int even = 0, odd = 0;
        while(number != 0){
            if(number % 2 == 0){
                even++;
            }
            else if(number % 2 != 0){
                odd++;
            }
            number /= 10;
        }
        System.out.println("Четных: " + even + "\nНечетных: " + odd);
    }
}
