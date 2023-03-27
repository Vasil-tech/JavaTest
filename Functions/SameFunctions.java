package Functions;

import java.util.Scanner;

public class SameFunctions {
    public static void main(String argsp[]){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first int: ");
            int x = scan.nextInt();

            System.out.print("Enter second int: ");
            int y = scan.nextInt();

            System.out.print("Enter third int: ");
            int z = scan.nextInt();

            System.out.println("First result = " + Same(x, y, z));
            System.out.print("Second result = " + Same(x, z));
        }
    }
    public static int Same(int x, int y, int z){
        return x + y + z;
    }

    public static int Same(int x, int y){
        return x + y;
    }
}
