package Test.Polimorphism;

public class Employee extends Person{
    private String company;

    public Employee(String name, String surname, String company) { // эти поля обьявлены в базовом классе Person
        super(name, surname);// с помощью ключевого слова super мы вызываем конструктор родительского класса ( куда
        // помещаем значения name и surname
        this.company = company;
    }

    public void displayInfo(){ // с помощью ключевого слова super мы обращаемся к базовой релизации метода
        // displayInfo, которая указана в классе Person
        super.displayInfo();
        System.out.println("Company: "+ company);
    }
}
