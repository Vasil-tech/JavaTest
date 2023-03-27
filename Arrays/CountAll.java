package Arrays;
import java.util.Scanner;

public class CountAll
{
    public static void main(String[] args) {
    
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите свой текст: ");
            String strin = scan.nextLine();
            char[] result = strin.toCharArray();
            String[] array = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i",
                                            "j", "k", "l", "m", "n", "o", "p", "q", "r",
                                            "s", "t", "u", "v", "w", "x", "y", "z" };
            String[] arr = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
            String probel = " ";

            int symbols = 0;
            int spaces = 0;
            int integers = 0;
            int others = 0;
            
            for(char i : result){
                for(String j : array){
                    if (i == j.charAt(0)){
                        symbols++;
                    }
                }
                for(String k : arr){
                    if (i == k.charAt(0)){
                        integers++;
                    }
                }
                if (i == probel.charAt(0)){
                    spaces++;
                }
            }

            System.out.println("Длина строки " + result.length + " символов");
            System.out.println("Букв в строке " + symbols);
            System.out.println("Пробелов в строке " + spaces);
            System.out.println("Знаков в строке " + others);
            System.out.println("Чисел в строке " + integers);
        }
    }
}
