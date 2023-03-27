package Arrays;
public class MinMax {
    public static void main(String args[]){
        int[] arr = new int[] {24, -63, 67, -12, 88, 94, -28, 82, 0, 53};
        int max = arr[0];
        int min = arr[0];
        for(int value : arr){
            max = max < value ? value : max;
            min = min > value ? value : min;
        }
        System.out.println(String.format("Максимальный элемент массива %s", max));
        System.out.println(String.format("Минимальный элемент массива %s", min));
    }
}
