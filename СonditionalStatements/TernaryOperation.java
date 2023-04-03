package СonditionalStatements;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int i_1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int i_2 = scan.nextInt();

        int result = i_2 == 0 ? 1 : i_1 / i_2;
        System.out.println("Результат: " + result);
         
    }
}