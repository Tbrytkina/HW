package Test.Polimorphism;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) { // проинициализировали поля (вызвали конструктор)
        this.name = name;
        this.surname = surname;
    }

    public String getName() { // создали только геттеры, значит будет read-only
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + " Surname " + surname);
    }
}
