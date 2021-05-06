package Test.Abstract;

public class Bank {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "Swedbank");
        Client client = new Client("Jane", "Doe",
                employee.getName() + employee.getSurname());

        Person[] bankPersons = {employee, client}; // вариант 1
        for (Person person : bankPersons){
        person.displayInfo();
    }

        Object emp = new Employee("John", "Doe", "Swedbank");
        Person employee3 = new Employee("John", "Doe", "Swedbank");

        Object client2 = new Client("Jane", "Doe",
                employee.getName() + employee.getSurname());
        Person cl = new Client("Jane", "Doe",
                employee.getName() + employee.getSurname());

       // employee.displayInfo(); -  вариант 2
       // client.displayInfo();
    }

}
