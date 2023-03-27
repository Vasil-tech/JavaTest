package Functions;

import java.util.Scanner;

public class MiddleInt2 {
    public void MiddleArif(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int i_1 = scan.nextInt();

            System.out.print("Введите второе число: ");
            int i_2 = scan.nextInt();

            System.out.print("Введите третье число: ");
            int i_3 = scan.nextInt();

            int i_4 = (i_1 + i_2 + i_3) / 3;

            System.out.println("Среднее арифметическое = " + i_4);
        }
    }
}
