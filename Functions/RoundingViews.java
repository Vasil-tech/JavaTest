package Functions;

import java.util.Scanner;

public class RoundingViews {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("EВведите число: ");
            double x = scan.nextInt();
            double y = x / 1000;
            if (x > 1000){
                System.out.println("Получаем: " + Math.round(y * 10.0) / 10.0 + "K");
            }
            else{
                System.out.println("Получаем: " + x);
            }
        }
    }
}
