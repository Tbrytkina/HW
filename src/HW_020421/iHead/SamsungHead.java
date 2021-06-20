package HW_020421.iHead;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }
    public SamsungHead() {

    }

    @Override
    public void speak() {
        System.out.println("Speaks Samsung head");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
