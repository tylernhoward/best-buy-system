package strategy;

import model.Order;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class FirstClassShippingStrategy implements ShippingStrategyInterface {
    @Override
    public double calculateShippingCost(Order order){
        double flatCost = 9.99;
        double addedCost = order.getOrderedItems().size() * 2.99;
        return flatCost + addedCost;
    }
}
