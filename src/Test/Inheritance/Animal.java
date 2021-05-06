package Test.Inheritance;

public class Animal {
    protected String bread;
    protected String family;

    public Animal(String bread, String family) {
        this.bread = bread;
        this.family = family;
    }

    protected void speak(){
        System.out.println("Say something");
    }

}
