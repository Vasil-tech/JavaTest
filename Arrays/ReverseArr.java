package Arrays;
import java.util.Arrays;

public class ReverseArr {
    public static void main(String args[]){
        int[] x = {9, 25, 78, 23, -43, 4};
        int[] y = new int[x.length];
        int i = 0;
        for(int j = x.length - 1; j >= 0; j--){
            y[i] = x[j];
            i++;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(y));
    }
}
