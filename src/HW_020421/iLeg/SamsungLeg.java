package HW_020421.iLeg;

public class SamsungLeg implements iLeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg(){

    }
    @Override
    public void step() {
        System.out.println("Step by Samsung leg");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
