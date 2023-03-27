package СonditionalStatements;
import java.util.Scanner;

public class CalcDate {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число ваших дней: ");
            int i = scan.nextInt();

            int years = i / 365;
            int weeks = (i - (years * 365)) / 7;
            int days = i - ((years * 365) + (weeks * 7));

            System.out.println("Лет: " + years + " Недель: " + weeks + " Дней: " + days);
        }
        }
}
