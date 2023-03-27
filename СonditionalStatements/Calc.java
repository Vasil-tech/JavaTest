package СonditionalStatements;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Первое число: ");
            int int_1 = scan.nextInt();

            System.out.print("Операция: ");
            char operation = scan.next().charAt(0);

            System.out.print("Второе число: ");
            int int_2 = scan.nextInt();

            switch(operation){
                case ('*'):
                    System.out.println("Результат: " + (int_1 * int_2));
                    break;
                case ('/'):
                    String babka = int_2 > 0 ? Integer.toString(int_1 / int_2) : "Ошибка";
                    System.out.println("Результат: " + babka);
                    break;
                case ('+'):
                    System.out.println("Результат: " + (int_1 + int_2));
                    break;
                case ('-'):
                    System.out.println("Результат: " + (int_1 - int_2));
                    break;
            }
        }
    }    
}
