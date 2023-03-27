package Arrays;
import java.util.Arrays;

public class SortArray {
    public static void main(String args[]){
        int[] arr = new int[] {24, -63, 67, -12, 88, 94, -28, 82, 0, 53};
        int[] arr_2 = new int[] { };

        int min = arr[0];
        // int buffer = 0;
        while (true){
            int i = 0;
            if(min < arr[i]){
                arr_2[i] = min;
            }
            else{
                continue;
            }
            i++;
            if(arr_2.length >= arr.length){
                break;
            }
        }
        System.out.print("Отсортированный массив " + Arrays.toString(arr_2));
    }
}
