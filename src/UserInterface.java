import command.Aggregator;
import command.Invoker;

import java.util.Scanner;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class UserInterface {

    // Grab system interface singleton instance when UserInterface class loads
    private static SystemInterface systemInterface = SystemInterface.getInstance();

    public static void main(String[] args) {
        // Initialize a new invoker with a new aggregator
        systemInterface.setInvoker(new Invoker(new Aggregator()));

        // options loop
        displayOptions();
        
        Scanner scanner = new Scanner(System.in);

        String choice = "";
        while (!choice.equals("0")) {
            System.out.print("Enter in choice: ");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("Enter item name: ");
                    String name = scanner.next();
                    System.out.println("Is it vegetarian? (true or false)  ");
                    String isVegetarian = scanner.next();
                    String addedItem = systemInterface.addItem(name, Boolean.valueOf(isVegetarian));
                    System.out.println("Successfully added " + addedItem);

                    break;
            }


            displayOptions();
        }

        // call system interface methods

        // display result
    }

    private static void displayOptions() {
        System.out.println("Main menu");
        System.out.println("1 - Add Items");
        System.out.println("2 - Remove Items");
        System.out.println("3 - Display items");
        System.out.println("4 - Display number of vegetarian items");
    }
}
