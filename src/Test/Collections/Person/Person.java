package Test.Collections.Person;

public class Person {// implements Comparable<Person>  -типизируем объектом типа Person
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // @Override // надо реализовать метод - реализовываем логику нашей сортировки
   // public int compareTo(Person p) {
     //   return name.compareTo(p.getName());
    }
