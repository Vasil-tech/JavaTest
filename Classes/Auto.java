package Classes;

public class Auto {
    public static void main(String args[]){
        Auto2 auto = new Auto2();
        auto.weight = "1000кг";
        auto.name = "Toyota Supra";
        auto.color = 'B';
        auto.speed = "310 km/h";

        auto.gus();
        AirPlane wi = new AirPlane();
        AirPlane wi2 = new AirPlane();

        wi.wing.setWeigth(190);
        wi2.wing.setWeigth(180);

        System.out.println(wi.wing.getWeigth());
        System.out.println(wi2.wing.getWeigth());
    }
}
