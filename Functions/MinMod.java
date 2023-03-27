package Functions;

public class MinMod {
    public static void main(String[] args){
        int[] bob = new int[] { 9, 342, 2, -1, 34, -35, -12, -3, 4, -2, 23 };
        rasschet(bob);
    }
    public static void rasschet(int[] bob){
        int min = bob[0];
        for(int i = 0; i < bob.length; i++){
            if(min > bob[i]){
                min = bob[i];
            }
        }
        System.out.println(min);
    }
}
