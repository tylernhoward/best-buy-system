package decorator;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class ElectronicItemDecorator extends ReceiptDecorator {
    public ElectronicItemDecorator(Receipt receipt) {
        super(receipt);
    }
}
