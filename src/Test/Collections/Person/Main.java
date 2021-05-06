package Test.Collections.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //PersonNameComparator pcomp = new PersonNameComparator();
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> persons = new TreeSet<>(pcomp);

        persons.add(new Person("Tom",23));
        persons.add(new Person("Nick",10));
        persons.add(new Person("Tom",10));
        persons.add(new Person("Bill",14));

        for (Person p: persons){
            System.out.println(p.getName() + " " + p.getAge());
        }
        //System.out.println(persons.iterator().next().getName());
    }
}
