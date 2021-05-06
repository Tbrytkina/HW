package Test.PhoneValidator;

public class PhoneNumberValidator_Main {
    public static void main(String[] args) {
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();// у нас есть класс PhoneNumberValidator,
        // мы создем его обьект
        phoneNumberValidator.validatePhoneNumber("12345678"); // и у этого класса  PhoneNumberValidator мы хотим вызвать
        // метод , в котором есть локальный класс .validatePhoneNumber, который собственно нам проинициализирует наш
        // номер телефона (в скобках даем какой нибудь номер телефона)
    }
}
