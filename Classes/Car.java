package Classes;

public class Car {
	public int weight;
	public String model;
	public char color;
	public float speed;


	public void outPut () {
		System.out.println("Вес " + model + " составляет " + weight + "кг.");
		System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
	}
	
	public Car (int w, String m, char c, float s) {
		weight = w;
		model = m;
		color = c;
		speed = s;
	}
 
    public static void main(String[] args){
        Truck truck_1 = new Truck(20000, "Tesla Semi", 'b', 100, 6, 10000);
        truck_1.newWheels();

        Truck truck_2 = new Truck(20000, "Tesla Semen", 'b', 100, 6, 10000);
        truck_2.newWheels();
    }

	public Car () {}
}