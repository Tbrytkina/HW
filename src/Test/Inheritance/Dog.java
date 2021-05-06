package Test.Inheritance;

public class Dog extends Animal {
    private String dressageLevel;

    public Dog(String bread, String family, String dressageLevel) {
        super(bread, family);
        this.dressageLevel = dressageLevel;
    }

    @Override
    protected void speak() {
        System.out.println("Bark to someone or something");
    }
}
