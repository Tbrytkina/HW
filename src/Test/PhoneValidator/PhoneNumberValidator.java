package Test.PhoneValidator;

public class PhoneNumberValidator { // создали класс
    public void validatePhoneNumber(String number) { // в качестве параметра метода validatePhoneNumber будет
        //передаваться номер телефона, который пользователь ввел в какую-то форму
        class PhoneNumber { // создаем локальный класс, в котором и будет происходить валидация номера телефона
            private String phoneNumber; // обьявили закрытую переменную строкового типа, в которую будем записывать
            // номер телефона входящий от пользователя

            public PhoneNumber() { // в конструкторе мы эту закрытую переменную проиницализируем
                this.phoneNumber = number; // скажем, что this.phoneNumber мы хотим присвоить значение параметра,
                // которое мы передаем в метод
            }

            public String getPhoneNumber() { // создаем специальный метод (геттер), который нам будет возвращать
                return phoneNumber; // значение переменной (переменная у нас закрытая, мы должны каким то образом
                // к ней получить доступ)
            }

            public void setPhoneNumber(String phoneNumber) { // в принципе нам нужен и другой метод, который будет
                this.phoneNumber = phoneNumber; // восстанавливать значение в наше поле phoneNumber (может и не пона
                // добиться, но на всякий случай пусть будет и сеттер тоже
            }

            public void validatePhoneNumber() {
                try {
                    int phoneNumber = Integer.parseInt(getPhoneNumber());
                    System.out.println("Phone number validated successfully!");
                } catch (Exception e) { // ловим исключение
                    System.out.println("Phone number wasn't validate because an error occurred: " + e.getMessage());
                }
            }
        }
        PhoneNumber phoneNumber = new PhoneNumber(); //создание обьекта нашего локального класса PhoneNumber
        phoneNumber.validatePhoneNumber(); // и у этого класса phoneNumber мы дернем метод validatePhoneNumber(),
        // который обратиться к параметру метода validatePhoneNumber(String number) и попытается преобразовать его в
        // строку

    }
}