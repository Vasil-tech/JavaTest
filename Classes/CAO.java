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

    }
}

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
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