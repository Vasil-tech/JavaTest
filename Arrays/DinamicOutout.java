package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class DinamicOutout {
    public static void main(String[] args){
        ArrayList<Float> digits = new ArrayList<>(4);
        LinkedList<Boolean> probability = new LinkedList<>();
				
        digits.add(4.6f);
        digits.add(5.1f);
        digits.add(0.201f);
        digits.add(0.5f);

        probability.add(true);
        probability.add(false);
        probability.add(true);
        probability.add(true);

        for(Float i : digits) { System.out.println(i); }

        int i = 0;
        while(probability.size() > i){
            Boolean value = probability.get(i);
            System.out.println(value);
            i++;
        }
    }
    
}
