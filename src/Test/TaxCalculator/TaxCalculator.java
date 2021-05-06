package Test.TaxCalculator;

public class TaxCalculator {
    private double rate = 0.1;

    private double getRateFromDB(){
        return 0.1;
    }
    public double getTaxAmount (int price){
        return price * getRateFromDB();
    }
}

