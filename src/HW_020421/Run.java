package HW_020421;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();

        System.out.println();


        robot1.action();
        robot1.getPrice();

        robot2.action();
        robot2.getPrice();

        robot3.action();
        robot3.getPrice();

    } // пока вообще не доходит, как связать разные комплектующие (((
    // Может какую то наводку? Или может пример из лекций? Вроде все пересмотрела, но не доходит до меня...
}
