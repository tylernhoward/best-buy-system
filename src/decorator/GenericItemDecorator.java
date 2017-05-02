package decorator;

import model.AbstractItem;
import model.GenericItem;
import model.Order;

import java.util.List;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class GenericItemDecorator extends ReceiptDecorator {
    public GenericItemDecorator(Receipt receipt) {
        super(receipt);
    }

    @Override
    public void printReceipt(Order order) {
        super.printReceipt(order);
        printGenericItems(order);
    }

    private void printGenericItems(Order order) {
        List<AbstractItem> items = order.getOrderedItems();

        boolean hasGenericItems = false;

        // TODO - replace this with iterators when implemented
        System.out.println("*** GENERIC ITEMS ***");
        System.out.println("ITEM\tPRICE"); // headers
        for (AbstractItem item : items) {
            if (item instanceof GenericItem) {
                hasGenericItems = true;
                System.out.println(item.getName() + "\t$" + item.getPrice());
            }
        }

        // If it doesn't have generic items, print that it has none
        if (!hasGenericItems) {
            System.out.println("<none>\tN/A");
        }

        System.out.println();
    }
}
