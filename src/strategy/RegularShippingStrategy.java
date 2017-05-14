package strategy;

import model.Order;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class RegularShippingStrategy implements ShippingStrategyInterface {
    @Override
    public double calculateShippingCost(Order order) {
        double flatCost = 5.99;
        double addedCost = order.getOrderedItems().size() * 0.99;
        return flatCost + addedCost;
    }
}
