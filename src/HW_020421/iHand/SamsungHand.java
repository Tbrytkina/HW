package HW_020421.iHand;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }
    public SamsungHand(){

    }

    @Override
    public void upHand() {
        System.out.println("Samsung hand is up");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
