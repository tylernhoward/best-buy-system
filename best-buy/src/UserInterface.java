import java.util.Scanner;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class UserInterface {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new Aggregator());

        SystemInterface.setInvoker(invoker);

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
                    String addedItem = SystemInterface.addItem(name, Boolean.valueOf(isVegetarian));
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
