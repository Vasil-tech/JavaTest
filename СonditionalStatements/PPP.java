package СonditionalStatements;
import java.util.Scanner;

public class PPP {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите значение одной стороны: ");
            int a = scan.nextInt();

            System.out.print("Введите значение второй стороны: ");
            int b = scan.nextInt();

            System.out.println("Площадь = " + a * b);
            System.out.println("Периметр = " + ((a + b) * 2));
        }
    }
}
