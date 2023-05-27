package Classes;

public class Client extends Human{
    private String BankName;
    @Override
    public void Enter() {
        System.out.println("Имя " + super.getName() + "\nФамилия " + super.getSurname() + "\nБанк клиента " + BankName);
    }
    public Client(String name, String surname, String BankName){
        super(name, surname);
        this.BankName = BankName;
    }    
}
