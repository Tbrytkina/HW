package Test.Person;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        // if (!checkNumbersAndWildcardsContaining(name)){
        // this.name = name
        //{
        this.name = name;
        this.surname = surname;
        if (!(age < 0) && !(age >= 100)) {
            this.age = age;
        }else{
            System.out.println("Incorrect age");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!(age < 0) && !(age >= 100)) {
            this.age = age;
        }else{
            System.out.println("Incorrect age");
        }
    }

    //private boolean checkNumbersAndWildcardsContaining(String name){
    // logic
    // return true;
    }
