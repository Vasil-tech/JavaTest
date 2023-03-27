package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
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
            System.out.print("Массив до сортировки: ");
            for(int value : array){
                System.out.print(value + " ");
            }

            System.out.println();

            Arrays.sort(array);
            System.out.print("Массив после сортировки: ");
            for(int value_2 : array){
                System.out.print(value_2 + " ");
            }
        }
        System.out.println();
    }
}
