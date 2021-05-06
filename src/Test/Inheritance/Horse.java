package Test.Inheritance;

public class Horse extends Animal {
    private boolean wearsHorseShoes;

    public Horse(String bread, String family,boolean wearsHorseShoes) {
        super(bread, family);
        this.wearsHorseShoes = wearsHorseShoes;
    }

    public void jumpThroughBarrier(int heightOfBarrier){
        System.out.println("Horse jumped with barrier " + heightOfBarrier + "cm!");

    }

    @Override
    protected void speak() {
        System.out.println("Say I-ho-ho!");
    }
}
