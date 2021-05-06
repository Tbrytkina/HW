package Test.Collections.States;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application {
    public static void main(String[] args) {
        Deque<Person> persons= new ArrayDeque<>();
        persons.addFirst(new Person("Tom"));
        persons.addLast(new Person("Nick"));

        for (Person p : persons){
            System.out.println(p.getName());
        }


    }
}
