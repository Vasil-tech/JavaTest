package СonditionalStatements;
import java.util.Scanner;


public class ValueCalc {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите два числа: ");
            int str = scan.nextInt();
            int str2 = scan.nextInt();

            int a = str + str2;
            int b = str - str2;
            int c = str * str2;
            int d = str / str2;
            int e = str % str2;

            System.out.println("Сложение = " + a + "\n" + "Вычитание = " + b + "\n" + "Умножение = " + c 
                                + "\n" + "Деление = " + d + "\n" + "Остаток от деления = " + e);
        }
    }
            
}
