package Test.InterfaceMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        Map<Integer, String> states = new TreeMap<>();

        states.put(2,"Germany");
        states.put(1,"France");
        states.put(4,"Italy");
        states.put(3,"Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        for(Map.Entry<Integer, String> state : states.entrySet()){
            System.out.printf("Key: %d State: %s  \n", state.getKey(), state.getValue());
        }
    }
}
