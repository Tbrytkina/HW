package HW_020421.iHand;

public class SamsungHand implements iHand{
    private int price = 15;

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
