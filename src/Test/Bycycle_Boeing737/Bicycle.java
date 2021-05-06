package Test.Bycycle_Boeing737;

public class Bicycle {
    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("GO!");
    }

    public class SteeringWheel { // описали класс руля, он содержит некие действия, которые могут выполнять его обьекты
        public void right() {
            System.out.println("Turn to right");
    }

        public void left() {
            System.out.println("Turn to left");
        }
    }
    public class Seat{ //описали класс сидения, он содержит некие действия, которые могут выполнять его обьекты
        public void up(){
            System.out.println("Seat up!");
        }
        public void down(){
            System.out.println("Seat down!");
        }
    }
}


