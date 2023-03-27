package Functions;

public class SendParameters {
    public static void main(String[] args){
        Result(11, 0, 5);
    }
    public static void Result(double a, double b, double c){
        double result = (b != 0 && c != 0) ? a / b / c : 000000000000;
        System.out.println(result); 
    }
}
