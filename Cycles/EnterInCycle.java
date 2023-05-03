package Cycles;

public class EnterInCycle {
    public static void main(String[] args){
        for(int i = 25; i < 30; i++){
            if(i != 27){ System.out.println(i); }
        }
        int i = 25;
        do { 
            if(i != 27){ System.out.println(i); }
            i++;
        }while(i < 30);
    }
}
