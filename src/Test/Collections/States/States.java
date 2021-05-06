package Test.Collections.States;

import java.util.ArrayDeque;
import java.util.Deque;

public class States {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");

        System.out.println(states);

        /*while(states.peek() != null){
            System.out.println(states.pop());
        }*/

        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.printf("Queue size: %d\n", states.size());
    }
}
