package Classes;

import java.util.Scanner;

public class Master {
    Scanner scan = new Scanner(System.in);
    private String age;

    public void Enter(){
        System.out.print("Введите ваш возраст: ");
        age = scan.nextLine();
        System.out.print("Ваш возраст: " + age);
    }
}
