package Test.ArrayList;

import java.util.ArrayList;

public class Countries {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany"); // индекс 0
        states.add("France"); // индекс 1
        states.add("Great Britain");
        states.add("Spain");
        states.add(1, "Italy");

        // states.remove("Germany");
        //states.remove(1);

        states.subList(1,2); // возвращает представление из оригинального листа

        for (String s : states) {
            System.out.println(s);
        }

        System.out.println(states.get(1));
        states.set(1, "Danmark");
        System.out.println();
        for (String s : states) {
            System.out.println(s);

        }
        if (states.contains("Germany")) {
            System.out.println("List contains state Germany");
        }
        /*Object[] objstates = states.toArray();
        for (Object o : objstates) {
            System.out.println(o);
            } = преобразование коллекции в обычный массив*/
        }
    }

