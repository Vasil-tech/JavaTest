package Arrays;
import java.util.Scanner;

public class AlmostSmallest {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите размерность своего массива: ");
            int i = scan.nextInt();
            int[] array = new int[i];
            for(int j = 0; j < i; j++){
                System.out.print("Число массива: ");
                int enter = scan.nextInt();
                array[j] = enter;
            }
            int small = array[0];
            int preSmall = array[0];
            for (int value : array){
                small = small > value ? value : small; 
                for(int value_2 : array){
                    preSmall = value_2 > small & value_2 < preSmall ? value_2 : preSmall;
                }
            }
            System.out.println("Минимальный " + small);
            System.out.println("Второй минимальный "+ preSmall);
        }
    }
}
