package Test.Polimorphism;

public class Bank {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "Oracle");
        employee.displayInfo();

        String name = employee.getName();
        String surname = employee.getSurname();
        System.out.printf("Name and surname from getter: %s, %s", name, surname);
    }
}
