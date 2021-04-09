package HW_090421;

public class Car_Start {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", 120.5, 61999.99);
        Car car1 = new Car("Nissan", 100.2, 12999.99);
        Car car3 = new Car ("Renault", 123.3, 19999.99);

        try {
            car.start();
        } catch (Car_Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            car1.start();
        } catch (Car_Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.start();
        } catch (Car_Exception e) {
            System.out.println(e.getMessage());
        }
    }
}