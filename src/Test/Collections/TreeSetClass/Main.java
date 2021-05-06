package Test.Collections.TreeSetClass;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String > states = new TreeSet<>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.printf("TreeSet  contains %d elements \n", states.size());

        for(String state : states){
            System.out.println(state);
        }
    }
}
