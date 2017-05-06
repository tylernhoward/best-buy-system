import command.Aggregator;
import command.Invoker;
import model.AbstractItem;
import model.ElectronicItem;
import model.ElectronicItemType;
import model.OnlineStore;

import java.util.ArrayList;
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

        // options loop
        displayOptions();
        
        Scanner scanner = new Scanner(System.in);

        String choice = "";
        while (!choice.equals("0")) {
            System.out.print("Enter in choice: ");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    break;
            }


            displayOptions();
        }

        // call system interface methods

        // display result
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
        OnlineStore onlineStore = new OnlineStore();

        List<AbstractItem> inventory = new ArrayList<>();
        // example: Add iphone7 item, 6 in stock
        inventory.add(new ElectronicItem("iPhone 7", 699.00, ElectronicItemType.CELL_PHONE, "720p", 5.0));
        // more items here





        onlineStore.setInventory(inventory);
    }
}
