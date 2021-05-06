package Test.Collections.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Belarus");
        states.add("Vietnam");

        /* 1 - Iterator<String> iterator = states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
           2 - for(String s :states) {
            System.out.println(s);*/

            ListIterator<String> listIterator = states.listIterator();
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
            listIterator.set("Estonia");
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }
        }
    }
