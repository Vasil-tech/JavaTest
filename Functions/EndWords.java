package Functions;

import java.util.Scanner;

public class EndWords {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите своё число: ");
            int inte = scan.nextInt();

            res(inte);
        }
    }    
    public static void res(int intor){
        String str = intor == 1 ? " год" : (intor > 1) && (intor < 5) ? " года" : (intor > 5) ? " лет" : "Error";
        System.out.println(intor + str);
    }
}
