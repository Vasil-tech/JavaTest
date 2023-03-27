package Functions;

public class CountingNumbers {
    public static void main(String args[]){
        counting("782123");
    }
    public static void counting(String str_num){
        for (int i = 0; i < str_num.length(); i++) // Перебираем все число
          System.out.println(str_num.substring(i));
    }
}
