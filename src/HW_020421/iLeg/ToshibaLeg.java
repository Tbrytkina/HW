package HW_020421.iLeg;

public class ToshibaLeg implements iLeg{
    private int price =40;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg(){

    }

    @Override
    public void step() {
        System.out.println("Step by Toshiba leg");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
