package Arrays;

import java.util.ArrayList;

public class DynArrMethod {
    public static void main(String[] args){
        ArrayList digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);

        ArrayList digits2 = digits;
        int indexOfLastElement = digits2.size() - 2;
        digits2.remove(indexOfLastElement);
        digits2.add(2, 5.2);

        for(Object i : digits2){
            System.out.println(i);
        }
    }
}
