package Functions;

import java.util.Scanner;

public class Overload {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String bibus = scan.nextLine();
        String arstocka = scan.nextLine();
        overload_1(bibus, arstocka);
        overload_2(1, 1);
        overload_3(1, true);
    }
    public static void overload_1(String bibka, String bibka2){
        System.out.println(bibka + " " + bibka2);
    }
    public static void overload_2(int bibka, int bibka2){
        System.out.println(bibka);
        System.out.println(bibka2);
    }
    public static void overload_3(int bibka, Boolean bibka2){
        System.out.println(bibka + " " + bibka2);
    }
}
