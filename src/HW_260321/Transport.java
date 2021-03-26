package HW_260321;

public class Transport {
    protected int power;
    protected int maximumSpeed;
    protected int weight;
    protected String brand;

    public Transport(int power, int maximumSpeed, int weight, String brand) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    protected void description(){
        System.out.printf("Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s",
                power, maximumSpeed, weight, brand);
    }
}
