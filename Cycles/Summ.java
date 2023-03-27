package Cycles;

public class Summ {
    public static void main(String[] args){
        int result = 0;
        for (int i = 0; i < 100; i++){
            if(i % 4 == 0){
                result += i;
            }
        }
        System.out.println(result);
    }
}
