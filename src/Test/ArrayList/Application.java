package Test.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.addAll(Arrays.asList(new String[]{"a", "b", "c", "d", "e"}));

        List<String> a2 = a1.subList(2,4); // распечатываем с индекса 2 до индекса 4 (индекс 4 не входит)
        System.out.println(a2);

        System.out.println("Adding x...");
        a2.add("x");
        System.out.println(a2);
        System.out.println(a1);

        //a1.add("y");
        // System.out.println(a2); - выдает ошибку паралельной индетификации, так делать нельзя!!!
    }
}
