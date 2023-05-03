package Cycles;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i_1 = scan.nextInt();
        for(int i = 1; i <= i_1; i++){
            int quadro = i * i;
            System.out.println("Квадрат числа " + i + " равен: " + quadro);
        }
    }
}