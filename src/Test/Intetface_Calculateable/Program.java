package Test.Intetface_Calculateable;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,6));
        System.out.println(calculator.sum(5,6,10));

    }
}
