package Algoritms;

import java.util.Scanner;

public class DepoCalc {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер вклада: ");
        double deposit = scan.nextDouble();
        System.out.print("Введите количество лет: ");
        double years = scan.nextDouble();
        System.out.print("Введите размер ставки: ");
        double bet = scan.nextDouble();

        for(int i = 1; i < years; i++){
            deposit *= 1 + bet / 100;
            System.out.printf("После " + i + " года - " + "%.2f", deposit);
            System.out.println();
        }
        System.out.printf("В итоге после " + (years - 1) + " лет сумма составит " + "%.2f", deposit);
    }
}
