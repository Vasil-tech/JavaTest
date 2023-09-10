package Classes;

public class Auto2 {
    protected String weight;
    public String name;
    public char color;
    public String speed;

    StringBuilder sb = new StringBuilder();

    public void gus(){
        System.out.println("Вес " + weight + "\n" + "Mарка " + name + 
        "\n" + "Цвет " + "'" + color + "'" + "\n" + "Скорость " + speed);
    }
}
