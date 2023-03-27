package Arrays;
public class TwoArr {
    public static void main(String args[]){
        int i = 0;
        int[][] x = { { 0, 34, 2 }, { 9, 12, 18, 5 }, { 3, 4, 5 } };
        while (i < x.length){
            int j = 0;
            while(j < x[i].length){
                System.out.print(x[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
