package Test.Object;

public class Main {
    public static void main(String[] args) {
        Cat whiteCat = new Cat("Barsik", "Ivan Ivanov");
        Cat blackCat = new Cat("Barsik","Ivan Ivanov");

        System.out.println(blackCat.getClass());

        System.out.println(whiteCat.equals(blackCat)); // сравниваются ссылки(Они разные)

    }
}
