package Classes;

public class Truck extends Car{
    private float Wheels;
    private float MaxWeigth;

    public void newWheels(){
        System.out.println("Вес авто: " + weight + "\n" + "Модель авто: " + model + "\n" + 
                            "Скорость: " + speed + "\n" + "Кол-во колёс: " + Wheels + "\n" + 
                                "Максимальный вес: " + MaxWeigth);
    }

    public Truck(int weight, String model, char color, float speed, float wheels, float maxweigth){
        super(weight, model, color, speed);
        this.Wheels = wheels;
        this.MaxWeigth = maxweigth;
    }
}
