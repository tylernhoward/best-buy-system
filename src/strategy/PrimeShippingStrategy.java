package strategy;

import model.Order;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class PrimeShippingStrategy implements ShippingStrategyInterface {
    @Override
    public double calculateShippingCost(Order order) {
        return 0;
    }
}
