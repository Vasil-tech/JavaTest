package Functions;

import java.util.Scanner;

public class Sravnenie {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Первое число: ");
            int i_1 = scan.nextInt();

            System.out.print("Второе число: ");
            int i_2 = scan.nextInt();

            sravnenie(i_1, i_2);
        }
    }
    public static void sravnenie(int i_1, int i_2){
        String aaa = i_1 > i_2 ? ">" : i_1 < i_2 ? "<" : "=";
        System.out.println(aaa);
    }
}
