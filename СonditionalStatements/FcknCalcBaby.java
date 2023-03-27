package СonditionalStatements;
import java.util.Scanner;

public class FcknCalcBaby {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int int_1 = scan.nextInt();

        System.out.print("Введите операцию: ");
        String str = scan.nextLine();
        
        System.out.print("Введите второе число: ");
        int int_2 = scan.nextInt();


        switch(str){
            case "+": System.out.println("Результат: " + (int_1 + int_2)); break;
            case "-": System.out.println("Результат: " + (int_1 - int_2)); break;
            case "*": System.out.println("Результат: " + (int_1 * int_2)); break;
            case "/": System.out.println("Результат: " + (int_1 / int_2)); break;
            default: System.out.print("Косяк!");
        }
    }
}
