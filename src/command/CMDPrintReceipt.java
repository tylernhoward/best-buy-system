package command;

import decorator.AllItemDecorator;
import decorator.Receipt;
import decorator.SimpleReceipt;
import model.Order;

/**
 * Created by ealexhaywood on 5/7/17.
 */
public class CMDPrintReceipt implements CommandInterface {

    private Receipt receipt;
    private Order order;

    public CMDPrintReceipt(Receipt receipt, Order order) {
        this.receipt = receipt;
        this.order = order;
    }

    @Override
    public Receipt execute() {
        receipt.printReceipt(order);
        return receipt;
    }
}
