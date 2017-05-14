package strategy;
import model.Order;
/**
 * Created by tylerhoward on 5/12/17.
 */
public interface ShippingStrategyInterface {
    double calculateShippingCost(Order order);
}
