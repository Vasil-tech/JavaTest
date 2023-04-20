package Classes;

public class Maschine {
    public int Weight;
    public int Speed;
    public String Model;
    public String Color;

    public Maschine() { };

    public Maschine(int Weight, String Model, String Color, int Speed) {
        this.Weight = Weight;
        this.Model = Model;
        this.Color = Color;
        this.Speed = Speed;
    };

    public static void main(String[] args){
        Maschine mas = new Maschine(100, "Tesla", "Black", 290);
        System.out.println("Модель: " + mas.Model + "\n" + "Цвет: " + mas.Color + "\n" + "Скорость: " + mas.Speed + "\n" + "Вес машины: " + mas.Weight);
    }
}
