package strategy;

/**
 * Created by ealexhaywood on 5/13/17.
 */
public class OtherStateTaxStrategy implements TaxStrategy {
    @Override
    public double calcSalesTax(double price) {
        return price * 0.10; // flat 10% tax on other states bc we're mean
    }
}
