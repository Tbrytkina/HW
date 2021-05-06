package Test.Generics;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static class Utils {
        public static <T> T getValue (Object object) {
            return (T)object;

        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("123","321");

        for (Object element : list){
            String data = Utils.<String>getValue(element);
            // Integer data = Utils.<Integer>getValue(element);
            // Double data = Utils.<Double>getValue(element);
            System.out.println(data + " has" + data.getClass());
        }
    }
}
