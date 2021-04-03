package HW_020421.iHead;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Speaks Sony head");
    }

    @Override
    public int getPrice() {
        return price;

    }
}
