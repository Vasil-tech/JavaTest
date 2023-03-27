package СonditionalStatements;

import java.util.Scanner;

public class BioUser {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Ваше имя и фамилия? ");
            String str = scan.nextLine();
            String str2 = scan.nextLine();
            
            System.out.println("Сколько вам лет, " + str + "?");
            int i_1 = scan.nextInt();

            System.out.println("Здравствуйте, " + str + " " + str2 + "\n" + "Вам уже " + i_1 + " лет");
        }
    }    
}
