package Classes;

public class Home2 {

    public String name;
    public int floor, year;

    public void set(int floor, String name, int year){
        this.floor = floor;
        this.name = name;
        this.year = year;
    }
    public void bibka(){
        System.out.println("Этажей в доме " + floor + 
                        "\n" + "Название улицы: " + name + 
                        "\n" + "Год постройки: " + year);
        time();
    }
    public void time(){
        int years = 2022;
        int result = years - (this.year);
        System.out.println("Дому уже " + result + " лет");
    }
}
