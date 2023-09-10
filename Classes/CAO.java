package Classes;

public class CAO {
    public static void main(String args[]){
        Person person1 = new Person();
        // person1.name = "Gus";
        // person1.age = 40;\
        person1.setName("Gustavo");
        person1.getName();
        person1.setAge(25);
        person1.getAge();
        person1.speak();

        Person person2 = new Person();
        // person2.name = "Alan";
        // person2.age = 25;
        person1.setName("Georg");
        person1.getName();
        person2.setAge(40);
        person2.getAge();
        person2.speak();

        Person person3 = new Person();
        person3.setName(" ");
        person3.speak();

        Person.Jimmy = "Cum";
        Person.Jimmy = "Bum";
        System.out.println(Person.Jimmy);
    }
}

class Person{
    private String name;
    private int age;
    public static String Jimmy;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()){System.out.println("Ты ввёл пустое имя");}
        else{ this.name = name; }
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    void speak(){
        System.out.println("My name is " + name + ", I'm " + age + " years old");
    }
}