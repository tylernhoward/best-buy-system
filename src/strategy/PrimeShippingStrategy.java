package strategy;

import model.AbstractItem;
import model.Order;

import java.util.List;

/**
 * Created by tylerhoward on 5/12/17.
 */
public class PrimeShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShippingCost(List<AbstractItem> orderedItems) {
        return 0.0;
    }
}
