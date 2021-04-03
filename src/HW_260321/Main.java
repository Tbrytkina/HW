package HW_260321;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(137, 250, 1700, "AUDI", 4,
                5,"All Road", 5, 137);


        Cargo cargo = new Cargo(450, 85, 18000, "SCANIA",8,
                22,30,450);

        Civil civil = new Civil(89000, 1100, 28000, "Boeing737",64,
                3200,189, false,89000);

        Military military = new Military(110000,2830, 19000,"SY27",
                15,450,true,6,110000);



        passenger.description();
        cargo.description();
        civil.description();
        military.description();

    }

}
