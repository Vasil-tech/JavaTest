package СonditionalStatements;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите свой возраст: ");
            int i = scan.nextInt();
            String result = i > 18 ? "Вам уже все можно" : i < 18 ? "Вы еще слишком молоды" : "Ура, Вам 18 лет!";
            System.out.println(result);
        }
    }
    
}
