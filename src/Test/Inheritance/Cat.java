package Test.Inheritance;

public class Cat extends Animal {
    private boolean isCarnivores;

    public Cat(String bread, String family, boolean isCarnivores) {
        super(bread, family);
        this.isCarnivores = isCarnivores;
    }

    public void doPurr(){
        System.out.println("Murrr..."); //действие, характерное только для кошек
    }

    @Override // переопределен или метод интерфейса или метод класса
    protected void speak() {
        System.out.println("Say miau!");
    }

}

