package Classes;

public class CAO {
    public static void main(String args[]){
        Person person1 = new Person();
        person1.name = "Gus";
        person1.age = 40;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Alan";
        person2.age = 25;
    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + ", I'm " + age + " years old");
    }
}