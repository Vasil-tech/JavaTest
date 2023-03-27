package Functions;

public class Overload {
    public static void main(String[] args){
        overload("Bibus", "Bobus");
        overload(4, 5);
        overload(1, true);
    }
    public static void overload(String word_1, String word_2){
        System.out.println(word_1 + " " + word_2);
    }
    public static void overload(int i_1, int i_2){
        System.out.println(i_1);
        System.out.println(i_2);
    }
    public static void overload(int i_1, boolean b_1){
        System.out.println(i_1 + "+" + b_1);
    }
}
