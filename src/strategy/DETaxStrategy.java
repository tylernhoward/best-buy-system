package strategy;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class DETaxStrategy implements TaxStrategy {
    @Override
    public double calcSalesTax(double price) {
        return 0.0; //No sales tax
    }
}
