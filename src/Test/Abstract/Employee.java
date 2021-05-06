package Test.Abstract;

public class Employee extends Person {
    private String bank;


    public Employee(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: "+ getName() + " Surname: " + getSurname() + " works in bank " + bank);
    }
}
