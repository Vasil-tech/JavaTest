package СonditionalStatements;

public class ThreeSecure{
    public static void main(String args[]){
        int A = 4;
        String result = (A < 8 && A != 5 && A >= 2) || (A == -1) ? "Сработало" : "Не сработало";
        System.out.println(result);
    }
}