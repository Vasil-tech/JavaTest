package Arrays;
public class MiddleArifmetic {
    public static void main(String args[]){
        int[] arr = new int[] {5, 8, 18, 34, 3, 56, 43, 27, 4, 23};
        int middle_arifmetic = 0;
        for(int i = 0; i < arr.length; i++){
            middle_arifmetic += arr[i];
        }
        int MidArif = middle_arifmetic / arr.length;
        for(int i = 0; i < arr.length; i++){
            if(MidArif < arr[i])
                System.out.print(arr[i] + " ");
        }
        System.out.println("Middle arifmetic = " + MidArif);
    }
}
