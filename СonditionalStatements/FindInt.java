package СonditionalStatements;
import java.util.Scanner;

public class FindInt {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int num = scan.nextInt();
            int num2 = num * 2;
            // String str = String.valueOf(num * 2);
            System.out.println("Получаем: " + num + "" + num2);
        }
    }
}
