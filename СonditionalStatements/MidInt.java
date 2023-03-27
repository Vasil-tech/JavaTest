package СonditionalStatements;

import java.util.Scanner;

public class MidInt {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++){
                System.out.print("Введите число: ");
                arr[i] = scan.nextInt();
            }
            double i_4 = (arr[0] + arr[1] + arr[2]) / 3;
            String result = (arr[0] != arr[1]) && (arr[1] != arr[2]) && (arr[0] != arr[2]) ? Double.toString(i_4) : "Error";
            System.out.println("Итог: " + result);
        }
    }
}
