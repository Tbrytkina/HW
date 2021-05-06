package Test.Abstract;

public class Bank2 {
    public static void main(String[] args) {
        Object emp = new Employee("Bill", "Gates", "Microsoft");
        Person cl = new Client("Tom", "Joe", "Bill Gates");

        ((Employee)emp).displayInfo();
        cl.displayInfo();

    }
}

