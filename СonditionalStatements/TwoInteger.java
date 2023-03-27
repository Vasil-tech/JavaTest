package СonditionalStatements;
import java.util.Scanner;

public class TwoInteger {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int a = scan.nextInt();

            System.out.print("Введите второе число: ");
            int b = scan.nextInt();

            System.out.println("Итог = " + (a + b));
        }
    }
}
