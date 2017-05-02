package decorator;

import model.Order;

/**
 * Abstract receipt decorate class.  To be extended by decorators
 *
 * Created by ealexhaywood on 4/30/17.
 */
public abstract class ReceiptDecorator implements Receipt {
    protected Receipt receipt;

    public ReceiptDecorator(Receipt receipt) {
        this.receipt = receipt;
    }

    public void printReceipt(Order order) {
        receipt.printReceipt(order);
    }
}
