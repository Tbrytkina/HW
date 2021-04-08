package HW_020421.iHead;

public class ToshibaHead implements IHead {
    private int price;

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
