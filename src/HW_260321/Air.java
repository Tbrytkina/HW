package HW_260321;

public class Air extends Transport{
    private int wingspan;
    private int minimumRunwayLengthForTakeOff;

    public Air(int power, int maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff) {
        super(power, maximumSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    @Override
    protected void description() {
        System.out.printf("Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s " +
                        "Wing Span is: %d, Runway length is: %d",
                power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
    }
}
