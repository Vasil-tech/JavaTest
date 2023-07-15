import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Cycles {
    public static void main(String[] args){
        int[] A = new int[] {5, 2, 4, 6, 1, 3, 2, 6}; 
        int p = 1;
        int r = A.length;
        if(p < r){
            int q = round_half_down(p, r);
            Merge(A, p, q, r);
        }
    }

    public static int round_half_down(int p, int r){
        return (p + r) / 2;
    }

    public static void Merge(int[] A, int p, int q, int r){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++){
            list.add(A[i]);
        }
        list.add(p);
        list.add(q);
        list.add(r);

        System.out.println(list.toString());
    }    
}

// public static void Sort(int[] A, int p, int r){
    //     int max = 0;
    //     int temp = 0;
    //     ArrayList<Integer> list = new ArrayList<Integer>();

        // for(int i = 0; i < A.length; i++){
        //     list.add(A[i]);
        // }
        // list.add(p);
        // list.add(r);

    //     for(int i = 0; i < list.size(); i++){
    //         if(max < )
    //     }

    //     System.out.println(list.toString());
    // }


// Sort(A,p,r)
// 1 if p < r
// 2    then           q := round_half_down((p+r)/2)
// 3                       Sort(A,p,q)
// 4                       Sort(A,q+1,r)
// 5                       Merge(A,p,q,r)

// Пример массива:
// A = (5,2,4,6,1,3,2,6)

// Примера запуска:
// Sort(A,1,length[A])
