package decorator;

/**
 * Created by ealexhaywood on 4/30/17.
 */
public abstract class ReceiptDecorator implements Receipt {
    protected Receipt receipt;

    public ReceiptDecorator(Receipt receipt) {
        this.receipt = receipt;
    }

    @Override
    public void printReceipt() {
        receipt.printReceipt();
    }
}
