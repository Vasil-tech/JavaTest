package СonditionalStatements;

import java.util.Scanner;

public class VerifInteger {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число два числа ");
            int i_1 = scan.nextInt();
            int i_2 = scan.nextInt();
            String s_1 = i_1 % 2 == 0 ? "Первое число ок" : "Первое число не ок";
            String s_2 = i_2 % 2 == 0 ? "Второе число ок" : "Второе число не ок";

            System.out.println("По итогу мы имеем " + s_1 + " " + s_2);
        }
    }
}
