package decorator;

import model.Order;

/**
 * Simple receipt
 *
 * Created by ealexhaywood on 4/30/17.
 */
public class SimpleReceipt implements Receipt {
    @Override
    public void printReceipt(Order order) {
        System.out.println("***Printing Simple Receipt***");
        System.out.println();
        System.out.println("Order for: " + order.getUser());
        System.out.println("Order Placed: " + order.getDate());
        System.out.println("Best Buy Store order number: " + order.getOrderNumber().toString());
        System.out.println("Order Total: $" + order.getOrderTotal());
        System.out.println();
    }
}
