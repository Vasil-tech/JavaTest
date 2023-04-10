package Arrays;

public class OutputDoubArr {
    public static void main(String[] args){
        int[][] numbers = {
            {2, 45, 91},
            {90, 47, 82},
            {10, 5, 32},
            {8, 78, 30},
            {25, 1, 27},
            {38, 82, 83}
        };

        for(int[] i : numbers){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
