package Cycles;

public class OutputNum {
    public static void main(String[] args){
        for(int i = -7; i <= 12; i+=3){
            if(i == -1 || i == 5 || i == 11) continue;
            
            System.out.println(i);
        }
        int i = -7;
		do {
			if (i != -1 && i != 5 && i != 11)
				System.out.println (i);
			i += 3;
		} while (i < 12);
    }
}
