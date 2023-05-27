package Classes;

public class AirPlane {
    Wing wing = new Wing();
    class Wing{
        private int Weigth;

        public void setWeigth(int weigth){
            this.Weigth = weigth;
        }
        
        public String getWeigth(){
            return "Вес " + Weigth;
        }
    }
}
