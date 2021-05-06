package Test.HashSetClass;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(1); // HashSet игнорирует эту строчку кода без выброса ошибок

        for (int i : myHashSet){
            System.out.println(i);
        }

    }
}
