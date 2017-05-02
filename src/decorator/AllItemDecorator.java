package decorator;

import model.AbstractItem;
import model.ClothingItem;
import model.Order;

import java.util.List;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class AllItemDecorator extends ReceiptDecorator {
    public AllItemDecorator(Receipt receipt) {
        super(receipt);
    }

    @Override
    public void printReceipt(Order order) {
        super.printReceipt(order);
        printAllItems(order);
    }

    private void printAllItems(Order order) {
        List<AbstractItem> items = order.getOrderedItems();

        // TODO - replace this with iterators when implemented
        System.out.println("*** ALL ITEMS ***");
        System.out.println("ITEM\tTYPE\tPRICE"); // headers
        for (AbstractItem item : items) {
            System.out.println(item.getName() + "\t" + item.getClass().getSimpleName() + "\t$" + item.getPrice());
        }

        System.out.println();
    }
}
