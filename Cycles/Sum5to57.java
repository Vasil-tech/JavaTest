package Cycles;

public class Sum5to57 {
    public static void main(String[] args){
        int result = 0;
        for (int i = 5; i <= 57; i++){
            if(i == 34 || i == 46 || i == 52){
                continue;
            }
            else{ result += i; }
        }
        System.out.println(result);
        Sum();
    }
    public static void Sum(){
        int i = 5;
        int result = 0;
        do{
            if(i == 34 || i == 46 || i == 52){
                i++;
                continue;
            }
            else{ result += i; }
            i++;
        }while(i <= 57);
        System.out.println(result);
    }
}
