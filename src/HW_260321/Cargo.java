package HW_260321;

public class Cargo extends Land{
    private int carryingCapacity;
    private double powerKW;

    public Cargo(int power, int maximumSpeed, int weight, String brand, int numberOfWheels,
                 int fuelConsumption, int carryingCapacity, double powerKW) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
        this.powerKW = 0.74 * power;
    }

    @Override
    protected void description() {
        System.out.printf("Cargo truck - Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s " +
                        "Carrying Capacity is: %d, PowerKW is "  + this.powerKW  + "\n",
                power, maximumSpeed, weight, brand, carryingCapacity);
    }
}
