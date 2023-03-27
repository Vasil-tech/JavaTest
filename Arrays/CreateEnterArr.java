package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class CreateEnterArr {
    public static void main(String args[]){
        System.out.print("Введите размерность массива: ");
        try (Scanner scan = new Scanner(System.in)) {
            int k = scan.nextInt();
            int[] arr = new int[k];
            for(int value = 0; value < arr.length; value++){
                System.out.print("Введите число массива: ");
                int j = scan.nextInt();
                arr[value] = j;
            }
            System.out.println("Массив: " + Arrays.toString(arr));
        }
    }
}
