package Classes;

public class Employee extends Human {
    private String BankName;
    @Override
    public void Enter() {
        System.out.println("Имя " + super.getName() + "\nФамилия " + super.getSurname() + "\nБанк работника " + BankName);
    }
    public Employee(String name, String surname, String BankName){
        super(name, surname);
        this.BankName = BankName;
    }
}
