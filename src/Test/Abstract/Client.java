package Test.Abstract;

public class Client extends Person{
    private String employeeFullName;

    public Client(String name, String surname, String employeeFullName) {
        super(name, surname);
        this.employeeFullName = employeeFullName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() + " Surname: " + getSurname() + " was serviced by " + employeeFullName);

    }
}
