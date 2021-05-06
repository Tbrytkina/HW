package Test.Collections.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());/*берет наш р1, вызывает у него метод compareTo() и будет
        вызывать у р2 метод getName(). Таким образом, через compareTo будет сравнивтаь имена двух объектов и
        возвращать нам результат типа int (отрицательное, положительное или равно)*/
    }
}
