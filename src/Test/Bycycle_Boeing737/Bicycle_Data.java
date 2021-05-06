package Test.Bycycle_Boeing737;

public class Bicycle_Data {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("LTD", 15);
        Bicycle.SteeringWheel wheel = bicycle.new SteeringWheel();
        Bicycle.Seat seat = bicycle.new Seat();

        seat.up(); // подняли сидение
        bicycle.start(); // начали движение
        wheel.right(); // руль вправо
        wheel.left(); // руль влево


        // через класс Bicycle мы обращаемся к нашему классу SteeringWheel через точку, т.е. мы к
        //внутреннему классу обращаемся через внешний класс (внешний класс содержит ссылку на свой внутренний класс)
        // и через имя внешнего класса мы обращаемся к внутреннему классу, чтобы создать в нем объект
    }
}
