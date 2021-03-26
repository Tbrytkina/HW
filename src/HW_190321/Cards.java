package HW_190321;

public class Cards {
    public void validateCardNumber(String number) {

        class CardNumber {
            private String cardNumber;

            public CardNumber() {
                this.cardNumber = cardNumber;
            }

            public String getCardNumber() {
                return cardNumber;
            }

            public void setCardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
            }

            public void validateCardNumber() {
                try {
                    int cardNumber = Integer.parseInt(getCardNumber());
                    System.out.println("Card number validated successfully!");
                } catch (Exception e) { // ловим исключение
                    System.out.println("Card number wasn't validate because an error occurred: " + e.getMessage());
                }
            }
        }
        CardNumber cardNumber = new CardNumber();
        cardNumber.validateCardNumber();
    }
}