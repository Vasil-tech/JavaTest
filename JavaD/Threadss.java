package JavaD;

class Threads2 extends Thread{
    public void run(){
        for(int i = 100; i >= 90; i--){
            System.out.println(i);
        }
    }
}
class Threads3 extends Thread{
    public void run(){
        System.out.println("This is a simple string");
    }
}
public class Threadss {
    public static void main(String[] args)
    {
        Threads2 th1 = new Threads2();
        Threads3 th2 = new Threads3();
        th1.start();
        th2.start();
    }
}