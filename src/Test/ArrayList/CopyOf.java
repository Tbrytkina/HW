package Test.ArrayList;

import java.util.List;

public class CopyOf {
    public static void main(String[] args) {
        List<String > list1 = List.of("a","b", "c");
        System.out.println(list1);

        List<String> list2 = List.copyOf(list1);
        System.out.println(list2);
    }
}
