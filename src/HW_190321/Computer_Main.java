package HW_190321;

public class Computer_Main {
    public static void main(String[] args) {
        Computer computer = new Computer("PowerVR SGX535", 128, 500);

        computer.start();
        computer.end();
    }
}


