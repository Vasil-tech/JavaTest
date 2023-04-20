package Classes;

public class PostMaster extends Master{
    public void Enter(){
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.print("Ваше имя: " + name);
    }
}
