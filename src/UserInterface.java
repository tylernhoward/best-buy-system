import command.Aggregator;
import command.Invoker;
import iterators.OnlineStoreIterator;
import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class UserInterface {

    // Grab system interface singleton instance when UserInterface class loads
    private static SystemInterface systemInterface = SystemInterface.getInstance();

    private static OnlineStore onlineStore;

    public static void main(String[] args) {
        // Initialize a new invoker with a new aggregator
        systemInterface.setInvoker(new Invoker(new Aggregator()));

        // initialize the store with items
        initializeOnlineStore();

        Scanner scanner = new Scanner(System.in);
        boolean promptUser = true;

        do {
            displayOptions();
            System.out.print("Enter in choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        displayItemsInStore();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;

                    // exit
                    case 0:
                        System.out.println("Exiting...");
                        promptUser = false;
                        break;

                    // invalid/other choices
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Your choice was not a number.");
                scanner.next(); // consume the invalid token
            }
        } while (promptUser);

        // call system interface methods

        // display result
    }

    private static void displayItemsInStore() {
        System.out.println("***DISPLAYING ITEMS IN STORE***");
        OnlineStoreIterator itr = onlineStore.getAllItemsIterator();

        int count = 1;
        while (itr.hasNext()) {
            System.out.println("Item #" + count++ + ": " + itr.next().toString());
        }

        System.out.println();
    }

    private static void displayOptions() {
        System.out.println("Main menu");
        System.out.println("1 - Display items in store"); // Use iterator design pattern
        System.out.println("2 - Add item to cart"); // command
        System.out.println("3 - Remove item from cart"); // command
        System.out.println("4 - Display items in cart"); // command
        System.out.println("5 - Check receipt"); // using decorater pattern
        System.out.println("6 - Apply promo code"); // calculates new receipt total using strategy design pattern
    }

    private static void initializeOnlineStore() {
        List<AbstractItem> inventory = new ArrayList<>();
        // example: Add iphone7 item, 6 in stock
        inventory.add(new ElectronicItem("iPhone 7", 699.00, ElectronicItemType.CELL_PHONE, "720p", 5.0));
        inventory.add(new ElectronicItem("Surface Pro", 399.99, ElectronicItemType.LAPTOP, "1080p", 15.0));
        inventory.add(new ClothingItem("Affliction T-Shirt", 39.99, ClothingItemType.SHIRT, "Large", false));
        inventory.add(new ClothingItem("Spongebob Pants", 12.49, ClothingItemType.PANTS, "Medium", true));
        inventory.add(new FoodItem("Frozen T-Bone Steak 6-Pack", 45.99, FoodItemType.MEAT, false));
        inventory.add(new FoodItem("Fresh Spinach", 6.00, FoodItemType.VEGETABLES, true));
        inventory.add(new GenericItem("Towels", 15.99));
        inventory.add(new GenericItem("Bed Sheets", 29.99));
        onlineStore = new OnlineStore(inventory);
    }
}
