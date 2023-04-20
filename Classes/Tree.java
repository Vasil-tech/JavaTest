package Classes;

public class Tree {
    public String Name;
    public int Age;
    public Boolean Life;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name) {
        this.Age = age;
        this.Name = name;
    }

    public Tree(int age, String name, Boolean life) {
        this.Age = age;
        this.Name = name;
        this.Life = life;
    }

    public static void main(String[] args){
        Tree tr = new Tree();
        Tree tr_2 = new Tree(150, "Doob", true);
        System.out.println("Лет: " + tr_2.Age + "\n" + "Название дерева: " + tr_2.Name + "\n" + "Живое ли дерево: " + tr_2.Life);
    }
}
