package TestTest;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args){
        List<String> animals = new ArrayList<String>();
        animals.add("cock");
        animals.add("boobs");
        animals.add("balls");

        String stroka = animals.get(1);
        System.out.println(stroka);


        GaySex gaysex = new GaySex();

        List animalss = new ArrayList();
        animalss.add("Hitler");
        animalss.add("Dassler");
        animalss.add("Hebbels");
        animalss.add("Soloviev");
        animalss.add(gaysex);

        // String koka = (String)animalss.get(4);
        System.out.println(animalss.get(4));
    }
}

class GaySex {
    public GaySex() {
        System.out.println("cum");
    }
}
