package TestTest;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args){
        // List<String> animals = new ArrayList<String>();
        // animals.add("cock");
        // animals.add("boobs");
        // animals.add("balls");

        // String stroka = animals.get(1);
        // System.out.println(stroka);


        Arstocka gaysex = new Arstocka() {
            @Override
            public void kosyak() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'kosyak'");
            }

            @Override
            public void kosyak2() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'kosyak2'");
            }

            @Override
            public void kosyak3() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'kosyak3'");
            }

            @Override
            public void kosyak4() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'kosyak4'");
            }          
        };


        gaysex.kosyak2();
        gaysex.kosyak();
        // List animalss = new ArrayList();
        // animalss.add("Hitler");
        // animalss.add("Dassler");
        // animalss.add("Hebbels");
        // animalss.add("Soloviev");
        // animalss.add(gaysex);

        // // String koka = (String)animalss.get(4);
        // System.out.println(animalss.get(4));

        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        listOfAnimal.add(new Animal()); 

        text(listOfAnimal);


        
    }
    private static void text(List<Animal> list){
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }
    
    
}

class GaySex {
    public void GachiSex() {
        System.out.println("cum");
    }
}

interface Arstocka {
    public void kosyak();
    public void kosyak2();
    public void kosyak3();
    public void kosyak4();
}