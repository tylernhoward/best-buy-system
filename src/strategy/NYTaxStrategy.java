package strategy;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class NYTaxStrategy implements TaxStrategy{
    @Override
    public double calcSalesTax(double price) {
        return price*0.08875; //average sales tax in NYS
    }
}
