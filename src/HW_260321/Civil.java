package HW_260321;

public class Civil extends Air{
    private int numberOfPassengers;
    private boolean businessClassAvailability;
    private double powerKW;

    public Civil(int power, int maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff,
                 int numberOfPassengers, boolean businessClassAvailability, double powerKW) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);

        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
        this.powerKW = 0.74 * power;
    }


    @Override
    protected void description() {
        super.description();
        System.out.printf("Civil plane - Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s," +
                        "Number of passengers is: %d, Business Class - %s, PowerKW is " + this.powerKW  + "\n",
                power, maximumSpeed, weight, brand, numberOfPassengers, businessClassAvailability);
    }
}
