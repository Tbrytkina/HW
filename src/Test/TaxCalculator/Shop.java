package Test.TaxCalculator;

public class Shop {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        int price = 10;
        System.out.println(taxCalculator.getTaxAmount(price));

    }
}
