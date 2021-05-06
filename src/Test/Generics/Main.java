package Test.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* List list = new ArrayList();
        list.add("Hello");
        String text = list.get(0) + ", world"; //конгатинация (объединение строки с каким то значением)
         (+) - будет возращаться тип String
        System.out.println(text);*/
        List <String> list = new ArrayList<>();
        list.add("Hello");
        list.add("123");

        for (Object o : list) { // пробегаемся по всей коллекции и вывести все, что там лежит на экран
            System.out.println("Value: " + (String) o);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        for (Object obj : list2) { // пробегаемся по всей коллекции и вывести все, что там лежит на экран
            System.out.println(obj);
        }
    }
}