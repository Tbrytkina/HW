package HW_260321;

public class Military extends Air {
    private boolean ejectionSystem;
    private int numberOfMissilesOnBoard;
    private double powerKW;

    public Military(int power, int maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff,
                    boolean ejectionSystem, int numberOfMissilesOnBoard, double powerKW) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeOff);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
        this.powerKW = 0.74 * power;
    }


    @Override
    protected void description() {
        System.out.printf("Military plain - " + "Power is: %d, Maximum speed is: %d, Weight is: %d, Brand is: %s " +
                        "Ejection system is: %s, Number of missiles on board is: %d, PowerKW is " + this.powerKW  + "\n",
                power, maximumSpeed, weight, brand, ejectionSystem, numberOfMissilesOnBoard);
    }

}
