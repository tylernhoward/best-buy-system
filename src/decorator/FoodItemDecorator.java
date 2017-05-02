package decorator;

import model.AbstractItem;
import model.FoodItem;
import model.Order;

import java.util.List;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class FoodItemDecorator extends ReceiptDecorator {
    public FoodItemDecorator(Receipt receipt) {
        super(receipt);
    }

    @Override
    public void printReceipt(Order order) {
        super.printReceipt(order);
        printFoodItems(order);
    }

    private void printFoodItems(Order order) {
        List<AbstractItem> items = order.getOrderedItems();

        boolean hasFoodItems = false;

        // TODO - replace this with iterators when implemented
        System.out.println("*** FOOD ITEMS ***");
        System.out.println("ITEM\tPRICE"); // headers
        for (AbstractItem item : items) {
            if (item instanceof FoodItem) {
                hasFoodItems = true;
                System.out.println(item.getName() + "\t$" + item.getPrice());
            }
        }

        // If it doesn't have food items, print that it has none
        if (!hasFoodItems) {
            System.out.println("<none>\tN/A");
        }

        System.out.println();
    }
}
