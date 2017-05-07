package system;

import command.Invoker;
import iterators.OnlineStoreIterator;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ealexhaywood on 4/15/17.
 */
public class SystemInterface {

    private static Invoker invoker;
    private static OnlineStore onlineStore;

    public static String addItem(int index) {
        AbstractItem abstractItem = invoker.addItem(onlineStore.getInventory().get(index));
        return abstractItem.toString();
    }

    public static String removeItem(int index) {
        AbstractItem abstractItem = invoker.removeItem(invoker.getAggregator().getAll().get(index));
        return abstractItem.toString();
    }

    public static List<String> getCartItems() {
        return invoker.getItems().stream().map(item -> item.toString()).collect(Collectors.toList());
    }

    public static void displayItemsInStore() {
        System.out.println();
        System.out.println("***DISPLAYING ITEMS IN STORE***");
        OnlineStoreIterator itr = onlineStore.getAllItemsIterator();

        int count = 1;
        while (itr.hasNext()) {
            System.out.println("Item #" + (count++) + ": " + itr.next().toString());
        }

        System.out.println();
    }

    public static void initializeOnlineStore() {
        onlineStore = OnlineStore.getInstance();
        List<AbstractItem> inventory = new ArrayList<>();
        inventory.add(new ElectronicItem("iPhone 7", 699.00, ElectronicItemType.CELL_PHONE, "720p", 5.0));
        inventory.add(new ElectronicItem("Surface Pro", 399.99, ElectronicItemType.LAPTOP, "1080p", 15.0));
        inventory.add(new ClothingItem("Affliction T-Shirt", 39.99, ClothingItemType.SHIRT, "Large", false));
        inventory.add(new ClothingItem("Spongebob Pants", 12.49, ClothingItemType.PANTS, "Medium", true));
        inventory.add(new FoodItem("Frozen T-Bone Steak 6-Pack", 45.99, FoodItemType.MEAT, false));
        inventory.add(new FoodItem("Fresh Spinach", 6.00, FoodItemType.VEGETABLES, true));
        inventory.add(new GenericItem("Towels", 15.99));
        inventory.add(new GenericItem("Bed Sheets", 29.99));
        onlineStore.setInventory(inventory);
    }

    public static void setInvoker(Invoker invoker) {
        SystemInterface.invoker = invoker;
    }

    public static OnlineStore getOnlineStore() {
        return onlineStore;
    }

    public static void printSimpleReceipt(String type) {
        invoker.printSimpleReceipt(type);
    }
}
