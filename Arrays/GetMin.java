package Arrays;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {9, 342, 2, -1, 34, -35, -12, -3, 4, -2, 23};
        getMin(arr);
    }

    public static void getMin(int[] arr) {
        // Изначально минимальным пускай будет первый элемент
        // Плюс делаем его по модулю
        int min = Math.abs(arr[0]);
        // Перебираем все элементы и 
        // если есть какой-то более минимальный элемент по модулю,
        // то запишем его как новый минимум
        for (int i = 1; i < arr.length; i++) {      
          if (min > Math.abs(arr[i]))
              min = arr[i];
        }

        System.out.println("Мнимальный элемент по модулю: " + min);
    }
}
