package Test.InterfaceMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> states = new LinkedHashMap<>();

        states.put(1,"Germany");
        states.put(2,"France");
        states.put(3,"Italy");
        states.put(4,"Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        for(Map.Entry<Integer, String> state : states.entrySet()){
            System.out.printf("Key: %d State: %s  \n", state.getKey(), state.getValue());
        }
    }
}
