package Test.Collections.Application;

public class Application {
    static int division(int delimoe, int delitel) throws ArithmeticException {
        if (delitel == 0) {
            throw new ArithmeticException("Your parameter for division is incorrect!");
        }
        return delimoe / delitel;
    }
}
