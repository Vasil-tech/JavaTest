package Classes;

import java.util.Date;

public class Home {
    public int floors;
    public static int year;
    public static String name;

    public void Enter(int floors, int year, String name){
        Home home = new Home();
        this.floors = floors;
        home.year = year;
        home.name = name;
    }

    public void Output(){
        System.out.println("Этажей: " + this.floors + "\n" + "Год постройки: " + year + "\n" + "Название: " + name);
    }

    public void Date(){
        Date date = new Date();
        int year_ = date.getYear();
        int yearsAgo = year_ + 1900 - year;
        System.out.println("Лет с постройки прошло: " + yearsAgo);
    }
}
