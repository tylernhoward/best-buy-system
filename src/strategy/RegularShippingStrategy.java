package strategy;

import model.AbstractItem;
import model.Order;

import java.util.List;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class RegularShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShippingCost(List<AbstractItem> orderedItems) {
        double flatCost = 5.99;
        double addedCost = orderedItems.size() * 0.99;
        return Math.round((flatCost + addedCost) * 100.0) / 100.0;
    }
}
