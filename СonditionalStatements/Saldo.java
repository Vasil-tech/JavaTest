package СonditionalStatements;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите прибыль: ");
            int i_1 = scan.nextInt();

            System.out.print("Введите убытки: ");
            int i_2 = scan.nextInt();

            int i_3 = i_1 - i_2;
            String stroka = i_3 >= 0 ? "Прибыль" : "Убыток";

            System.out.println(stroka + " составляет: " + i_3 + "руб.");
        }
    }
}
