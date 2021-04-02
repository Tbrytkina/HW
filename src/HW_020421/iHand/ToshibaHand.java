package HW_020421.iHand;

public class ToshibaHand implements iHand{
    private int price = 35;

    public ToshibaHand(int price) {
        this.price = price;
    }
    public ToshibaHand(){

    }

    @Override
    public void upHand() {
        System.out.println("Toshiba hand is up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
