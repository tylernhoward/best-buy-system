package strategy;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class MDTaxStrategy implements TaxStrategy{
    @Override
    public double calcSalesTax(double price) {
        return price*0.06; //sales tax in MD
    }
}
