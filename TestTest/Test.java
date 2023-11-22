package TestTest;

public class Test {
    public static void main(String[] args){
        // Poli bitch = new PoliChild();
        // PoliChild bitches = new PoliChild();

        // bit(bitch);
        // bit(bitches);

        // int x = 123;
        // String bibus = "1234";
        // x = Integer.parseInt(bibus);
        // System.out.println(x);

        // Poli bob = new Poli();
        // PoliChild bib = (PoliChild)bob;

        // bob.bark();
        // bib.bark();

        PoliChild dog = new PoliChild();
        Poli animal = dog;

        dog.bark();
        animal.cock();

        PoliChild dog2 = (PoliChild)animal;
        dog2.cock();
    }

    // public static void bit(Poli poli){
    //     poli.bark();
    // }
}
