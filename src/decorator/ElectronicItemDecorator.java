package decorator;

import model.AbstractItem;
import model.ElectronicItem;
import model.Order;

import java.util.List;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class ElectronicItemDecorator extends ReceiptDecorator {
    public ElectronicItemDecorator(Receipt receipt) {
        super(receipt);
    }

    @Override
    public void printReceipt(Order order) {
        super.printReceipt(order);
        printElectronicItems(order);
    }

    private void printElectronicItems(Order order) {
        List<AbstractItem> items = order.getOrderedItems();

        boolean hasElectronicItems = false;

        // TODO - replace this with iterators when implemented
        System.out.println("*** ELECTRONIC ITEMS ***");
        System.out.println("ITEM\tPRICE"); // headers
        for (AbstractItem item : items) {
            if (item instanceof ElectronicItem) {
                hasElectronicItems = true;
                System.out.println(item.getName() + "\t$" + item.getPrice());
            }
        }

        // If it doesn't have electronic items, print that it has none
        if (!hasElectronicItems) {
            System.out.println("<none>\tN/A");
        }

        System.out.println();
    }
}
