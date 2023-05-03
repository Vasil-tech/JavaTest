package Cycles;

import java.util.Scanner;

public class UnlimitedCyc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter: ");
            int i = scan.nextInt();
            if(i == 0) {
                System.out.println("Чао, Бамбино!");
                break;
            }
            else if(i == 1){
                System.out.println("Хэй, Бамбино");
                continue;
            }
        }
    }
}
