package HW_260321;

public class Passenger extends Land{
    private String bodyType;
    private int numberOfPassengers;
    private double powerKW;


    public Passenger(int power, int maximumSpeed, int weight, String brand, int numberOfWheels,
                     int fuelConsumption, String bodyType, int numberOfPassengers, double powerKW) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
        this.powerKW = 0.74 * power;
    }


    @Override
    protected void description() {
        System.out.printf("Passenger car - " + "Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s " +
                        "Body type is: %s, Number of passengers is: %d, PowerKW is " + this.powerKW  + "\n",
                power, maximumSpeed, weight, brand, bodyType, numberOfPassengers);
    }
}
