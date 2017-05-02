package decorator;

import model.AbstractItem;
import model.ClothingItem;
import model.Order;

import java.util.List;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class ClothingItemDecorator extends ReceiptDecorator {
    public ClothingItemDecorator(Receipt receipt) {
        super(receipt);
    }

    @Override
    public void printReceipt(Order order) {
        super.printReceipt(order);
        printClothingItems(order);
    }

    private void printClothingItems(Order order) {
        List<AbstractItem> items = order.getOrderedItems();

        boolean hasClothingItems = false;

        // TODO - replace this with iterators when implemented
        System.out.println("*** CLOTHING ITEMS ***");
        System.out.println("ITEM\tPRICE"); // headers
        for (AbstractItem item : items) {
            if (item instanceof ClothingItem) {
                hasClothingItems = true;
                System.out.println(item.getName() + "\t$" + item.getPrice());
            }
        }

        // If it doesn't have clothing items, print that it has none
        if (!hasClothingItems) {
            System.out.println("<none>\tN/A");
        }

        System.out.println();
    }
}
