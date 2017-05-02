package decorator;

/**
 * Just the price
 *
 * Created by ealexhaywood on 4/30/17.
 */
public class SimpleReceipt implements Receipt {
    @Override
    public void printReceipt() {
        System.out.println("***Printing Simple Receipt***");
        System.out.println();
        System.out.println("");
    }
}
