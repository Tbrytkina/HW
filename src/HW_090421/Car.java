package HW_090421;

import java.util.Scanner;

public class Car {
    public String name;
    public Double speed;
    public Double price;
    private boolean isCheckPetrolOn;


    public Car(String name, Double speed, Double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public void checkPetrolOn() {
        System.out.println("Бензина достаточно");
        this.isCheckPetrolOn = true;
    }


    public void start()throws Car_Exception {
            Scanner in = new Scanner(System.in);
            System.out.println();
            int a = (int) (Math.random() * (20-1)) + 1;
            if (a % 2 == 0) {
                System.out.println("Машина завелась");
            } else {
                throw new Car_Exception("Залейте бензин!");
            }
    }
}
