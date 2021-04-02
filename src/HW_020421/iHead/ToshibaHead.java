package HW_020421.iHead;

public class ToshibaHead implements iHead{
    private int price = 15;

    public ToshibaHead(int price) {
        this.price = price;
    }
    public ToshibaHead() {

    }

    @Override
    public void speak() {
        System.out.println("Speaks Toshiba head");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
