package Classes;

public abstract class Human {
    private String name;
    private String surname;

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;   
    }

    public abstract void Enter();

    public Human(){}

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
