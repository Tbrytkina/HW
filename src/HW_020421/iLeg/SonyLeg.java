package HW_020421.iLeg;

public class SonyLeg implements iLeg{
    private int price = 35;

    public SonyLeg(int price) {
        this.price = price;
    }
    public SonyLeg(){

    }

    @Override
    public void step() {
        System.out.println("Step by Sony leg");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
