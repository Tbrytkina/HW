package HW_260321;

public class Land extends Transport{
    private int numberOfWheels;
    private int fuelConsumption;

    public Land(int power, int maximumSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maximumSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    protected void description() {
        System.out.printf("Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s " +
                "Number of wheels is: %d, Fuel Consumption is: %d ",
                power, maximumSpeed, weight, brand, numberOfWheels,fuelConsumption);
    }
}
